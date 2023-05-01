package kodlamaio.hrms.core.verifications.abstracts;

import kodlamaio.hrms.entities.concretes.Employer;

public interface AdminCheckService {
	boolean isValid(Employer employer);
}
