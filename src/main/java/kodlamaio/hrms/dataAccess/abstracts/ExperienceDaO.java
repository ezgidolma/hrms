package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrms.hiringsystem.entities.concretes.Experience;

public interface ExperienceDaO extends JpaRepository<Experience, Integer> {

}
