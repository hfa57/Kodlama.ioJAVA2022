//SOLID: yaz�l�m geli�tirme prensipleri
public class Customer {
//bu class�m�zda �zellikleri tuttuk 
	
	public Customer() {
		System.out.println("M��teri nesnesi ba�lat�ld�");
	}
	
	public int Id;

	public String City;
	
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	
}