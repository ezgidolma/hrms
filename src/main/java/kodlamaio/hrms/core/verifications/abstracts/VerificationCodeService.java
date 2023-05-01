package kodlamaio.hrms.core.verifications.abstracts;

import kodlamaio.hrms.entities.concretes.User;

public interface VerificationCodeService {
	boolean sendEmail(User user);
}
