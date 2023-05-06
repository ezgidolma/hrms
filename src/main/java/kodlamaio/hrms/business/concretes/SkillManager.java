package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SkillService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SkillDaO;
import kodlamaio.hrms.entities.concretes.Skill;

@Service
public class SkillManager implements SkillService {
	private SkillDaO skillDao;
	@Autowired
	public SkillManager(SkillDaO skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		
		return new SuccessDataResult<List<Skill>>(this.skillDao.findAll());
	}

	@Override
	public DataResult<Skill> getById(int id) {

		return new SuccessDataResult<Skill>(this.skillDao.findById(id).get());
	}

	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("added");
	}

	@Override
	public Result update(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(int id) {
		this.skillDao.deleteById(id);
		return new SuccessResult("deleted");
	}
}
