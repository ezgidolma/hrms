package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "employers")
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name="employer_id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAds"})

public class Employer {

	
	@Column(name="company_name")
	@NotBlank
	@NotNull
	private String companyName;

	@Column(name="web_address")
	@NotBlank
	@NotNull
	private String webAdress;
	
	@Column(name="phone_number")
	@NotBlank
	@NotNull
	private String phoneNumber;
	
	@OneToMany(mappedBy = "employer")
	private List<JobAd> jobAds;

	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
}
