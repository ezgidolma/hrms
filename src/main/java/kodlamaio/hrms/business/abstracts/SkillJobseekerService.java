package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SkillJobSeeker;

public interface SkillJobseekerService {
	DataResult<List<SkillJobSeeker>> getAll();
	DataResult<SkillJobSeeker> getById(int id);
	Result add(int id,SkillJobSeeker skillJobseeker);
	Result update(SkillJobSeeker skillJobseeker);
	Result delete(int id);
}
