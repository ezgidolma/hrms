package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Resume;

public interface ResumeDaO  extends JpaRepository<Resume, Integer>{
	Resume getByJobseeker_Id(int id);
}
