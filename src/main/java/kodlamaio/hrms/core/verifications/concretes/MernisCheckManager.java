package kodlamaio.hrms.core.verifications.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.HrmsVerificationService;
import kodlamaio.hrms.core.verifications.abstracts.MernisCheckService;
import kodlamaio.hrms.entities.concretes.JobSeeker;

@Service
public class MernisCheckManager implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		return true;
	}

}
