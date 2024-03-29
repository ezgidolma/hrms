package hrms.hiringsystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import kodlamaio.hrms.entities.concretes.JobSeeker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "experiences")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Experience {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "workplace_name")
	private String workPlaceName;
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "starting_year")
	private int startingYear;
	
	@Column(name = "end_year")
	private Integer endYear;
	
	
	public String getEndYear() {
        if (this.endYear == null) {
        	return "Devam ediyor";
        }
        return this.endYear.toString();
    }


	public void setJobseeker(JobSeeker jobSeeker) {
		// TODO Auto-generated method stub
		
	}

}