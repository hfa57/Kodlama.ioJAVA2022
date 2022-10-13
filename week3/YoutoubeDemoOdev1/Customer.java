//SOLID: yazýlým geliþtirme prensipleri
public class Customer {
//bu classýmýzda özellikleri tuttuk 
	
	public Customer() {
		System.out.println("Müþteri nesnesi baþlatýldý");
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