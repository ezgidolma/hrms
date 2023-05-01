package kodlamaio.hrms.core.verifications.abstracts;

import kodlamaio.hrms.entities.concretes.JobSeeker;

public interface MernisCheckService {
	boolean checkIfRealPerson(JobSeeker jobSeeker);
}
