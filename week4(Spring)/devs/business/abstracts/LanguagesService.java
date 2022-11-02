package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.entities.concretes.Languages;

public interface LanguagesService {
	List <Languages> getAll();
	List<Languages> add(Languages language);

    List<Languages> deleteById(int id) throws Exception;

    List<Languages> updateById(int id,String updatedName) throws Exception;

    Languages findById(int id) throws Exception;

    Languages findByLangName(String LangName);

    boolean IsSameNameExist(String updatedName)throws Exception;

    boolean IsNameNull(Languages language)throws Exception;

    List<Languages> addLanguage(Languages language) throws Exception;
}

