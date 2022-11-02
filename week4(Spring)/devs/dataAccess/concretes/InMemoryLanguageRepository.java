package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Languages;

public class InMemoryLanguageRepository implements LanguageRepository {

	List<Languages> languages;
	
	public InMemoryLanguageRepository() {
		languages=new ArrayList<Languages>();
		languages.add(new Languages(1, "Java"));
		languages.add(new Languages(2, "C#"));
		languages.add(new Languages(3, "Python"));
	}

	@Override
	public List<Languages> getAll() {
		
		return languages;
	}

	  @Override
	    public List<Languages> add(Languages language) {
	        languages.add(language);
	        return languages;
	    }

	    @Override
	    public List<Languages> update(int id, String updatedName) {
	        for (Languages language:languages){
	            if (language.getId()==id){
	                language.setName(updatedName);
	                break;
	            }
	        }
	        return languages;
	    }

	    @Override
	    public List<Languages> delete(int id) {

	        for (Languages language : languages) {
	            if (language.getId() == id) {
	                languages.remove(id - 1);
	                break;
	            }
	        }
	        return languages;
	    }

	    @Override
	    public Languages findById(int id) {
	        for(Languages language:languages){
	          if(language.getId()==id){
	              return language;
	          }
	        }
	        return null;
	    }

	    @Override
	    public Languages findByName(String langName) {
	        for(Languages language:languages) {
	            if (langName.toLowerCase().equals(language.getName().toLowerCase())) {
	                return language;
	            }
	        }
	        return null;
	    }

	}
