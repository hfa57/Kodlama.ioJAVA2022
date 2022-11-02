package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.LanguagesService;
import kodlama.io.devs.entities.concretes.Languages;

@RestController  
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguagesService languagesService;
	
	//@AutoWired
	public LanguagesController(LanguagesService languagesService) {
		super();
		this.languagesService = languagesService;
	}
	
	
	@GetMapping("/getall")
	public List<Languages>getAll(){
		return languagesService.getAll();
	}
	 @GetMapping("/findbyid")
	    public Languages findById(int id) throws Exception {
	        return languagesService.findById(id);
	    }
	    @GetMapping("/findbyname")
	    public Languages findByName(String updatedName) {
	        return languagesService.findByLangName(updatedName);
	    }
	    @GetMapping("/issamenameexist")
	    public boolean sameNameIsExist(String langName) throws Exception {
	        return languagesService.IsSameNameExist(langName);
	    }
	    @PostMapping("/addcourse")
	    public List<Languages> addCourse(Languages course) throws Exception{
	        return languagesService.addLanguage(course);

	    }
	    @DeleteMapping("/deletebyid")
	    public List<Languages> deleteById(int id) throws Exception{
	        return languagesService.deleteById(id);
	    }
	    @PutMapping("/updatebyname")
	    public List<Languages> updateById(int id, String langName) throws Exception {
	        return languagesService.updateById(id, langName);
	    }
}
