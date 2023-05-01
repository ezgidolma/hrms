package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.LanguageJobSeeker;

public interface LanguageJobSeekerDaO extends JpaRepository<LanguageJobSeeker, Integer>{

}
