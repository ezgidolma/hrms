package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.LanguageJobSeeker;

public interface LanguageJobSeekerService {
	DataResult<List<LanguageJobSeeker>> getAll();
	DataResult<LanguageJobSeeker> getById(int id);
	Result add(int id,LanguageJobSeeker languageJobseeker);
	Result update(LanguageJobSeeker languageJobseeker);
	Result delete(int id);
}
