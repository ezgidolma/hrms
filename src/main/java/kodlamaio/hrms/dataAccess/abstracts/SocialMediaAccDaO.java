package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SocialMediaAccount;

public interface SocialMediaAccDaO  extends JpaRepository<SocialMediaAccount, Integer>{

}
