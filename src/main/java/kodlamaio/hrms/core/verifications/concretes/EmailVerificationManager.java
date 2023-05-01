package kodlamaio.hrms.core.verifications.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.EmailVerificationService;

@Service
public class EmailVerificationManager implements EmailVerificationService {

	@Override
	public Result verifyAccount(Object object) {
		return new SuccessResult(object + " adresine doğrulama kodu gönderildi.");
	}

}
