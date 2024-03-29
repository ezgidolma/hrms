package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="job_advertisements")
public class JobAdvertisement {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
	   private int id; 
	   @Column(name="description")
	   private String description;
	   @Column(name="min_salary")
	   private int min_salary;
	   @Column(name="max_salary")
	   private int max_salary;
	   @Column(name="number_of_position")
	   private int number_of_position;
	   @Column(name="is_active")
	   private boolean is_active;
	   @Column(name="due_date")
	   private Date due_date;
	   @Column(name="release_date")
		private Date releaseDate;
	   
	   @ManyToOne()
	   @JoinColumn(name="job_id")
	   Job job;
	   
	   @ManyToOne()
	   @JoinColumn(name="city_id")
	   City city;
	   
	   @ManyToOne()
	   @JoinColumn(name="employer_id")
	   Employer employer;

	public void set_active(boolean b) {
		// TODO Auto-generated method stub
		
	}
}
