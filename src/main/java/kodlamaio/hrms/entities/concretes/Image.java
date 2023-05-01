package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "images")
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Image {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="uploaded_date")
	private String uploadedDate;
	
	@Column(name="public_id")
	private String public_id;
	
	 @OneToOne()
	 @JoinColumn(name="user_id")
	 private User user;

}