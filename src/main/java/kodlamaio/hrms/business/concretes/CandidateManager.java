package kodlamaio.hrms.business.concretes;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.CandidateService;
import kodlamaio.hrms.core.adapters.CheckService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.core.verifications.abstracts.EmailVerificationService;
import kodlamaio.hrms.dataAccess.abstracts.CandidateDao;
import kodlamaio.hrms.entities.concretes.Candidate;

public class CandidateManager implements CandidateService {
	
	private CandidateDao candidateDao;
	private CheckService checkService;
	private EmailVerificationService emailVerificationService;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao, CheckService checkService,
			EmailVerificationService emailVerificationService) {
		super();
		this.candidateDao = candidateDao;
		this.checkService = checkService;
		this.emailVerificationService = emailVerificationService;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(), "Adaylar listelendi.");
	}

	@Override
	public Result add(Candidate candidate) throws NumberFormatException, RemoteException {
		if(isEmailUsed(candidate.getEmail()).isSucces() && isIdentityNumberlUsed(candidate.getIdentityNumber()).isSucces() && checkIfRealPerson(candidate).isSucces()) {
			this.candidateDao.save(candidate);
			System.out.println(this.emailVerificationService.verifyAccount(candidate.getEmail()).getMessage());
			return new SuccessResult("Aday eklendi." + candidate.getFirstName());
		} else {
			return new ErrorResult(isEmailUsed(candidate.getEmail()).getMessage() + isIdentityNumberlUsed(candidate.getIdentityNumber()).getMessage() + checkIfRealPerson(candidate).getMessage());
		}
	}
	public Result isEmailUsed(String email) {
		if(this.candidateDao.findByEmail(email) == null) {
			return new SuccessResult("");
		} else {
			return new ErrorResult("Email daha önce kullanılmış!");
		}
	}

	public Result isIdentityNumberlUsed(String identityNumber) {
		if(this.candidateDao.findByIdentityNumber(identityNumber) == null) {
			return new SuccessResult("");
		} else {
			return new ErrorResult("Bu kimlik numarası daha önce kullanılmış!");
		}
	}

	public Result checkIfRealPerson(Candidate candidate) throws NumberFormatException, RemoteException {
		if(this.checkService.checkIfRealPerson(candidate)) {
			return new SuccessResult("");
		} else {
			return new ErrorResult("Mernis doğrulaması gerçekleşmedi!");
		}
	}

}
