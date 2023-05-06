package kodlamaio.hrms.business.abstracts;

import java.util.List;

import hrms.hiringsystem.entities.concretes.Experience;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

public interface ExperienceService {
	DataResult<List<Experience>> getAll();
	DataResult<Experience> getById(int id);
	Result add(Experience experience,int id);
	Result update(Experience experience);
	Result delete(int id);
}
