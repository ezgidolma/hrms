package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CoverLetter;

public interface CoverLertterService {
	DataResult<List<CoverLetter>> getAll();
	DataResult<CoverLetter> getById(int id);
	Result add(int id,CoverLetter coverLetter);
	Result update(CoverLetter coverLetter);
	Result delete(int id);
}
