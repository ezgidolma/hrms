package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{

	//@Query(value="SELECT employer FROM Employer employer WHERE employer.email = ?1")
		Employer findByEmail(Object email);
}
