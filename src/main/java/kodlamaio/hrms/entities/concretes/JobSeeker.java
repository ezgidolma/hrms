package kodlamaio.hrms.entities.concretes;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import hrms.hiringsystem.entities.concretes.Experience;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker { // iş arayan
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="id")
	   private int id;  
	   
	   @Column(name="first_name")
	   private String first_name;
	   
	   @Column(name="last_name")
	   private String last_name;
	   
	   @Column(name="national_identity")
	   private String national_identity;
	   
	   @Column(name="birth_date")
	   private Date birth_date;

	   //@JsonIgnore
	   @OneToMany(mappedBy="jobseeker")
	   private List<Education> educations;
	   
	   //@JsonIgnore
	   @OneToMany(mappedBy="jobseeker")
	   private List<SocialMediaAccount> socialMediaAccounts;
	   
	   //@JsonIgnore
	   @OneToMany(mappedBy="jobseeker")
	   private List<Experience> experiences;
	   
	   //@JsonIgnore
	   @OneToMany(mappedBy="jobseeker")
	   private List<CoverLetter> coverletters;
	   
	   @OneToOne()
	   @JoinColumn(name="user_id")
	   private User user;
	   
	  // @JsonIgnore
	   @OneToMany(mappedBy="jobseeker")
	   private List<LanguageJobSeeker> languagejobseekers;
		
	   //@JsonIgnore
	   @OneToMany(mappedBy="jobseeker")
	   private List<SkillJobSeeker> skilljobseekers;
}
