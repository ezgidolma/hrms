package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Image;


public interface ImageDaO extends JpaRepository<kodlamaio.hrms.entities.concretes.Image, Integer>{
	 List<Image> getByUser_Id(int id);
	
}
