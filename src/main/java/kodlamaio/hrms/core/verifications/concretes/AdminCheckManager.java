package kodlamaio.hrms.core.verifications.concretes;

import kodlamaio.hrms.core.verifications.abstracts.AdminCheckService;
import kodlamaio.hrms.entities.concretes.Employer;

public class AdminCheckManager implements AdminCheckService {
	@Override
	public boolean isValid(Employer employer) {
		// TODO Auto-generated method stub
		return true;
	}
}
