package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobSeekerService;
import kodlamaio.hrms.business.abstracts.SkillJobseekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.dataAccess.abstracts.SkillJobSeekerDao;
import kodlamaio.hrms.entities.concretes.SkillJobSeeker;

@Service
public class SkillJobseekerManager implements SkillJobseekerService{
	private JobSeekerDao skillJobseekerDao;
	private JobSeekerDao jobseekerDao;
	@Autowired
	public SkillJobseekerManager(JobSeekerDao skillJobseekerDao, JobSeekerDao jobseekerDao) {
		super();
		this.skillJobseekerDao = skillJobseekerDao;
		this.jobseekerDao = jobseekerDao;
	}



	@Override
	public Result add(int id, SkillJobSeeker skillJobseeker) {
		skillJobseeker.setJobseeker(this.jobseekerDao.findById(id).get());
		return new SuccessResult("eklendi");
	}

	@Override
	public Result update(SkillJobSeeker skillJobseeker) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		this.skillJobseekerDao.deleteById(id);
		return new SuccessResult("deleted");
	}



	@Override
	public DataResult<List<SkillJobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public DataResult<SkillJobSeeker> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


}