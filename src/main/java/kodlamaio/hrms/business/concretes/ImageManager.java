package kodlamaio.hrms.business.concretes;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.ImageService;
import kodlamaio.hrms.business.abstracts.UserService;
import kodlamaio.hrms.core.adapters.CloudService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.ImageDaO;
import kodlamaio.hrms.entities.concretes.Image;

@Service
public class ImageManager implements ImageService{
	private ImageDaO imageDao;
	private CloudService cloudService;
	private UserService userService;
	
	@Autowired
	public ImageManager(ImageDaO imageDao, CloudService cloudService, UserService userService) {
		super();
		this.imageDao = imageDao;
		this.cloudService = cloudService;
		this.userService = userService;
	}
	@Override
	public DataResult<List<Image>> getAll() {
		return new SuccessDataResult<List<Image>>(this.imageDao.findAll(),"listelendi");
	}
	@Override
	public DataResult<Image> getById(int id) {
		return new SuccessDataResult<Image>(this.imageDao.findById(id).get(),"resim:");
	}
	@Override
	public DataResult<List<Image>> getByUserId(int id) {
		return new SuccessDataResult<List<Image>>(this.imageDao.getByUser_Id(id));
	}
	
	@Override
	public Result delete(int id) throws IOException {
		var public_id=this.imageDao.findById(id).get().getPublic_id();
		var result=this.cloudService.delete(public_id);
		this.imageDao.deleteById(id);
		
		return new SuccessResult("deleted");
	}
	@Override
	public Result add(MultipartFile multipartFile, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
