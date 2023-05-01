package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Verification;

public interface VerificationDaO  extends JpaRepository<Verification, Integer>{

}
