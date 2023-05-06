package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.hrmsbackend.entities.concretes.Language;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "languages_jobseeker")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobseeker"})
public class LanguageJobSeeker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "level")
	private int level;
	
	@ManyToOne()
	@JoinColumn(name="jobseeker_id")
	JobSeeker jobseeker;
	
	@ManyToOne()
	@JoinColumn(name="language_id")
	Language language;

	public void setJobseeker(JobSeeker jobSeeker2) {
		// TODO Auto-generated method stub
		
	}

}