package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import hrms.hiringsystem.entities.concretes.Experience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="jobs")
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","advertisements","experiences"})
public class Job {
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
       private int id;
	   
	   @Column(name="name")
       private String name;
	   
	   @JsonIgnore
	   @OneToMany(mappedBy="job")
	   private List<JobAdvertisement> advertisements;
	   
	   @JsonIgnore
	   @OneToMany(mappedBy="job")
	   private List<Experience> experiences;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	      
}
