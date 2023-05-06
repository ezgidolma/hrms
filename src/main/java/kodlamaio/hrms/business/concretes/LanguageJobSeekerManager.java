package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LanguageJobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.dataAccess.abstracts.LanguageJobSeekerDaO;
import kodlamaio.hrms.entities.concretes.LanguageJobSeeker;

@Service
public class LanguageJobSeekerManager implements LanguageJobSeekerService {
	private LanguageJobSeekerDaO languageJobseekerDao;
	private JobSeekerDao jobseekerDao;
	

	@Override
	public DataResult<List<LanguageJobSeeker>> getAll() {
		return new SuccessDataResult<List<LanguageJobSeeker>>(this.languageJobseekerDao.findAll());
	}

	@Override
	public DataResult<LanguageJobSeeker> getById(int id) {
		return new SuccessDataResult<LanguageJobSeeker>(this.languageJobseekerDao.findById(id).get());
	}

	@Override
	public Result add(int id,LanguageJobSeeker languageJobseeker) {
		languageJobseeker.setJobseeker(this.jobseekerDao.findById(id).get());
		this.languageJobseekerDao.save(languageJobseeker);
		return new SuccessResult("eklendi");
	}

	@Override
	public Result update(LanguageJobSeeker languageJobseeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		var result=this.languageJobseekerDao.findById(id);
		if(!result.isPresent()) {
			return new ErrorResult("böyle bir id yok");
		}
		this.languageJobseekerDao.deleteById(id);
		return new SuccessResult("silindi");
		
	}

}
