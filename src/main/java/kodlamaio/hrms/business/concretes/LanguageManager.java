package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDaO;
import kodlamaio.hrms.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
	private LanguageDaO languageDao;
	@Autowired
	public LanguageManager(LanguageDaO languageDao) {
		super();
		this.languageDao = languageDao;
	}

	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>(this.languageDao.findAll(),"listelendi.");
	}

	@Override
	public DataResult<Language> getById(int id) {
		return new SuccessDataResult<Language>(this.languageDao.findById(id).get(),".");
	}

	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("ekleme yapıldı.");
	}

	@Override
	public Result update(Language language) {
		this.languageDao.save(language);
		return new SuccessResult("update yapıldı.");
	}

	@Override
	public Result delete(int id) {
		this.languageDao.deleteById(id);
		return new SuccessResult("delete yapıldı.");
	}
}
