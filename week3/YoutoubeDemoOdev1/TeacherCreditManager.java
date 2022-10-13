
//bir s�n�f birden fazla interface'i implemente edebilir
public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		//hesaplamalar
		System.out.println("��retmen kredisi hesapland�");
		
	}
	@Override
	public void Save() {
		
	}

}
//abstract s�n�flar s�n�f �z. g�sterir. Bu y�zden bir s�n�f sadece bir abstract s�n�f� inherit edebilir
//Bir s�n�f bir abstract class'� yada ba�ka bir class'� inherit edebilir. Yani hem class'� hem abstract class'� inherit edemez
//abstract s�n�flarda interfacelerde asla new'lenemez ikiside referans tiplerin �z. yararlan�r
//java da s�n�f� direkt ezebiliriz virtual yapmam�za gerek yok
