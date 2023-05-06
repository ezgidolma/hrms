package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.Business.BusinessRules;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.AdminCheckService;
import kodlamaio.hrms.core.verifications.abstracts.VerificationCodeService;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService{
	private EmployerDao employerDao;
	private VerificationCodeService verificationCodeService;
	private AdminCheckService adminCheckService;
	@Autowired
	public EmployerManager(EmployerDao employerDao, VerificationCodeService verificationCodeService,
			AdminCheckService adminCheckService) {
		super();
		this.employerDao = employerDao;
		this.verificationCodeService = verificationCodeService;
		this.adminCheckService=adminCheckService;
	}

	

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(employerDao.findAll(),"Employer Listed");
	}

	@Override
	public Result add(Employer employer) {
		
		Result result=BusinessRules.Run(
				CheckIfNull(employer));
		if(result!=null)
		{
			return result;
		}
		else if(!adminCheckService.isValid(employer))
		{
			return new ErrorResult("Employer is not validated by System Stuff.");
		}
		/*else if(!verificationCodeService.sendEmail(employer))
		{
			return new ErrorResult("Email is not verified yet.");
		}*/
		employerDao.save(employer);
		return new SuccessResult("employer added");
	}



	private Result CheckIfNull(Employer employer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	}

