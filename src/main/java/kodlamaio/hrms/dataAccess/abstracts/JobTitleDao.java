package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
	
	//@Query(value = "SELECT jobTitle FROM JobTitle jobTitle WHERE jobTitle.title = ?1")
	JobTitle findByTitle(String title);
}
