package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService{

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"İş pozisyonları listelendi.");
	}

	@Override
	public Result add(JobTitle title) {
		if(isJobTitleExist(title.getTitle()).isSucces()) {
			this.jobTitleDao.save(title);
			return new SuccessResult("Pozisyon başarıyla eklendi: " + title.getTitle());
			
		} else {
			return new ErrorResult("Bu pozisyon daha önce eklenmiş: " + title.getTitle());
	
		}
	}
	
	public Result isJobTitleExist(String jobTitle) {
		
		if(this.jobTitleDao.findByTitle(jobTitle) == null) {
			return new SuccessResult();
		} else {
			return new ErrorResult();
		}
	}


}
