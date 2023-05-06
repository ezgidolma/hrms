package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.business.abstracts.JobTitleService;
import kodlamaio.hrms.core.utilities.Business.BusinessRules;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobDao;
import kodlamaio.hrms.dataAccess.abstracts.JobTitleDao;
import kodlamaio.hrms.entities.concretes.Job;
import kodlamaio.hrms.entities.concretes.JobTitle;

@Service
public class JobManager implements JobService{


	private JobDao jobDao;
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}
	@Override
	public Result add(Job job) {
		Result result=BusinessRules.Run(CheckIfNameExist(job.getName()));
		if(result!=null) {
			return result;
		}
		jobDao.save(job);
		return new SuccessResult("job added");
	}
	public Result CheckIfNameExist(Object object) {
		List<Job> jobs=jobDao.findAll();
		for(Job job:jobs) {
			if(job.getName().equals(object))
			{
				return new ErrorResult("Name is already exist");
			}
		}
		return new SuccessResult();
	}
	@Override
	public DataResult<List<Job>> getAll() {
		
		return new SuccessDataResult<List<Job>>(jobDao.findAll(),"jobs listed");
	}

}
