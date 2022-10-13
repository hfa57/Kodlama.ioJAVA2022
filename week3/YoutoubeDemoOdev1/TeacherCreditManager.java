
//bir sýnýf birden fazla interface'i implemente edebilir
public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		//hesaplamalar
		System.out.println("Öðretmen kredisi hesaplandý");
		
	}
	@Override
	public void Save() {
		
	}

}
//abstract sýnýflar sýnýf öz. gösterir. Bu yüzden bir sýnýf sadece bir abstract sýnýfý inherit edebilir
//Bir sýnýf bir abstract class'ý yada baþka bir class'ý inherit edebilir. Yani hem class'ý hem abstract class'ý inherit edemez
//abstract sýnýflarda interfacelerde asla new'lenemez ikiside referans tiplerin öz. yararlanýr
//java da sýnýfý direkt ezebiliriz virtual yapmamýza gerek yok
