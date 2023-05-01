package kodlamaio.hrms.core.verifications.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms.core.verifications.abstracts.VerificationCodeService;
import kodlamaio.hrms.entities.concretes.User;

@Service
public class VerificationCodeManager implements VerificationCodeService {

	@Override
	public boolean sendEmail(User user) {
		
		return true;
	}
}
