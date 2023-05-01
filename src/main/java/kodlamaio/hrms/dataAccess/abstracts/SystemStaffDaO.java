package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.SystemStaff;

public interface SystemStaffDaO extends JpaRepository<SystemStaff, Integer> {

}
