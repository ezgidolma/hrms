package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SkillJobSeeker;

public interface SkillJobSeekerDao  extends JpaRepository<SkillJobSeeker, Integer>{

}
