package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Skill;

public interface SkillService {
	DataResult<List<Skill>> getAll();
	DataResult<Skill> getById(int id);
	Result add(Skill skill);
	Result update(Skill skill);
	Result delete(int id);
}
