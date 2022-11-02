package kodlama.io.devs.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.LanguagesService;
import kodlama.io.devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devs.entities.concretes.Languages;

@Service
public class LanguagesManager implements LanguagesService {

	private LanguageRepository languageRepository;
	
	
	
	public LanguagesManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}



	@Override
	public List<Languages> getAll() {
		//business rules
		return languageRepository.getAll();
	}
	@Override
    public List<Languages> add(Languages language) {
        return languageRepository.add(language);
    }

    @Override
    public List<Languages> deleteById(int id) throws Exception {
        findById(id);// throws exception so its form of validation...does it exist in repo ?
        return languageRepository.delete(id);
    }

    @Override
    public List<Languages> updateById(int id, String updatedName) throws Exception {
        findById(id);
        IsSameNameExist(updatedName);
        return languageRepository.update(id, updatedName);
    }

    @Override
    public Languages findById(int id) throws Exception {
        Languages
        isExist=languageRepository.findById(id);
        if (isExist!=null){
              return isExist;
        }else{
           throw new Exception(id+" Kimlik No'lu dil bulunmaktadır!");
        }
    }

    @Override
    public Languages findByLangName(String LangName) {
        Languages isExist=languageRepository.findByName(LangName);
        if (isExist!=null){
            return isExist;
        }else{
           return null;
        }
    }

    @Override
    public boolean IsSameNameExist(String updatedName)throws Exception {
       //İsim varmı algoritması.
       Languages isExist=languageRepository.findByName(updatedName);
       if(isExist==null){
           return true;
       }else{
           throw new Exception(updatedName+" isme sahip bir dil bulunmaktadır!");
       }
    }

    @Override
    public boolean IsNameNull(Languages language) throws Exception {
       //Kurs ismi boş geçemez algoritması!!
        String isNull=language.getName().replaceAll(" ","");

        if(isNull.equals("")||isNull.equals(null)){
            throw new Exception("Dil ismi boş olamaz!");
        }else{
            language.setName(language.getName().trim());
        }
       return true;
    }

    @Override
    public List<Languages> addLanguage(Languages language) throws Exception {
        if(IsSameNameExist(language.getName())&&IsNameNull(language)){
            return add(language);
        }else{
            throw new Exception(language.getName()+" bu isimli bir dil bulunmaktadır !");
        }
    }
}
