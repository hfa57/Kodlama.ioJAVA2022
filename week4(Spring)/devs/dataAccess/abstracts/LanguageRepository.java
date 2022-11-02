package kodlama.io.devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Languages;

public interface LanguageRepository {
	 List<Languages> getAll();//gets all languages;

	    List<Languages> add(Languages language);//Add new language and return the updated list...

	    List<Languages> update(int id, String updatedName);//update the language and return the updated list...

	    List<Languages> delete(int id);//delete the language and return the updated list...

	    Languages findById(int id);//find by id and return the Language object...

	    Languages findByName(String langName);//find by language name
	

}
