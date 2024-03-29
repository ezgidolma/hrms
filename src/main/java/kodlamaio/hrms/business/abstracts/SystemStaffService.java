package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SystemStaff;

public interface SystemStaffService {
	DataResult<List<SystemStaff>> getAll();
	DataResult<SystemStaff> getById(int id);
	Result add(SystemStaff systemStaff);
	Result update(SystemStaff systemStaff);
	Result delete(int id);
}
