package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SocialMediaAccService;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.hrms.dataAccess.abstracts.SocialMediaAccDaO;

import kodlamaio.hrms.entities.concretes.SocialMediaAccount;

@Service
public class SocialMediaAccManager implements SocialMediaAccService{

	private SocialMediaAccDaO socialMediaAccDao;
	private JobSeekerDao jobseekerDao;
	@Autowired
	public SocialMediaAccManager(SocialMediaAccDaO socialMediaAccDao,JobSeekerDao jobseekerDao) {
		super();
		this.socialMediaAccDao = socialMediaAccDao;
		this.jobseekerDao=jobseekerDao;
	}

	@Override
	public DataResult<List<SocialMediaAccount>> getAll() {
		return new SuccessDataResult<List<SocialMediaAccount>>(this.socialMediaAccDao.findAll());
	}

	@Override
	public DataResult<SocialMediaAccount> getById(int id) {
		return new SuccessDataResult<SocialMediaAccount>(this.socialMediaAccDao.findById(id).get());
	}

	@Override
	public Result add(int id,SocialMediaAccount socialMedia) {
		socialMedia.setJobSeeker(this.jobseekerDao.findById(id).get());
		this.socialMediaAccDao.save(socialMedia);
		return new SuccessResult("added");
	}

	@Override
	public Result update(SocialMediaAccount socialMedia) {
		this.socialMediaAccDao.save(socialMedia);
		return new SuccessResult("updated");
	}

	@Override
	public Result delete(int id) {
		this.socialMediaAccDao.deleteById(id);;
		return new SuccessResult("deleted");
	}

}