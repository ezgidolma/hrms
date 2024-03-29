package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SocialMediaAccount;

public interface SocialMediaAccService {
	DataResult<List<SocialMediaAccount>> getAll();
	DataResult<SocialMediaAccount> getById(int id);
	Result add(int id, SocialMediaAccount socialMedia);
	Result update(SocialMediaAccount socialMedia);
	Result delete(int id);
}
