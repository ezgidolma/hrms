package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import hrms.hiringsystem.entities.concretes.Experience;
import kodlamaio.hrms.business.abstracts.ExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ExperienceDaO;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;

@Service
public class ExperienceManager implements ExperienceService {
	ExperienceDaO experienceDao;
	JobSeekerDao jobseekerDao;
	@Autowired
	public ExperienceManager(ExperienceDaO experienceDao, JobSeekerDao jobseekerDao) {
		super();
		this.experienceDao = experienceDao;
		this.jobseekerDao=jobseekerDao;
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll(),"listed.");
	}

	@Override
	public DataResult<Experience> getById(int id) {
		return new SuccessDataResult<Experience>(this.experienceDao.findById(id).get(),".");
	}

	@Override
	public Result add(Experience experience,int id) {
		experience.setJobseeker(this.jobseekerDao.findById(id).get());
		this.experienceDao.save(experience);
		return new SuccessResult("ekleme yapıldı");
	}

	@Override
	public Result update(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult("update yapıldı");
	}

	@Override
	public Result delete(int id) {
		this.experienceDao.deleteById(id);
		return new SuccessResult("delete yapıldı");
	}
}
