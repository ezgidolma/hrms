package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.CityDaO;
import kodlamaio.hrms.entities.concretes.City;

@Service
public class CityManager implements CityService{
	
	private CityDaO cityDao;

	@Autowired
	public CityManager(CityDaO cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll(),"cities listed");
	}

	@Override
	public DataResult<City> getById(int id) {
		return new SuccessDataResult<City>(this.cityDao.findById(id).get());
	}

	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult("city added");
	}

	@Override
	public Result update(City city) {
		this.cityDao.save(city);
		return new SuccessResult("city updated");
	    
	}

	@Override
	public Result delete(int id) {
		this.cityDao.deleteById(id);
		return new SuccessResult("city deleted");
	}
	
	
	

}