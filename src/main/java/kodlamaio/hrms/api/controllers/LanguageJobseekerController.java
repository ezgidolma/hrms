package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.LanguageJobSeekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.LanguageJobSeeker;

@RestController
@RequestMapping("/api/languagejobseekers")
public class LanguageJobseekerController {
	private LanguageJobSeekerService languageJobseekerService;
    @Autowired
	public LanguageJobseekerController(LanguageJobSeekerService languageJobseekerService) {
		super();
		this.languageJobseekerService = languageJobseekerService;
	}
    @GetMapping("/getall")
    public DataResult<List<LanguageJobSeeker>> getAll(){
  	  return this.languageJobseekerService.getAll();
    }
    @GetMapping("/getbyid/{id}")
    public DataResult<LanguageJobSeeker> getById(@PathVariable int id){
  	  return this.languageJobseekerService.getById(id);
    }
    @PostMapping("/add")
    public Result add(int id,@RequestBody LanguageJobSeeker languageJobseeker){
  	  return this.languageJobseekerService.add(id,languageJobseeker);
    }
   
    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable int id){
  	  return this.languageJobseekerService.delete(id);
    }
}
