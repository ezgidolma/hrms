package kodlamaio.hrms.core.verifications.concretes;

import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.verifications.abstracts.MailCheckService;

@Service
public class MailCheckManager implements MailCheckService{

private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	
	@Override
	public boolean checkEmail(String email) {

		Pattern pt = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pt.matcher(email).find();
	}

}
