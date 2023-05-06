package kodlamaio.hrms;

import java.io.File;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class HrmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsApplication.class, args);
	}

	/*Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
			"cloud_name", "hrms23",
			"api_key", "484682368764463",
			"api_secret", "WxTrcdyRTNaaz5Gv2mwYwwAtnwc",
			"secure", true));	

	File file = new File("default.jpg");
	Map uploadResult = cloudinary.uploader().upload(file, ObjectUtils.emptyMap());
	System.out.println(uploadResult.get("url"));
*/
		
	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()                                       
	      .apis(RequestHandlerSelectors.basePackage("kodlamaio.hrms"))                    
	      .build();
	}

}
