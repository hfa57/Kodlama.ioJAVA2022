//Katmanl� Mimariler 
public class CustomerManager {
//constructor'lar void olmadan class'�n ismiyle ayn� olucak �ekilde yaz�l�yorlar
	private Customer _customer;//private sadece bu class'�n i�inde �al��abilir demek 
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {//interfac'ler referans tiptir
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save() {
		
		System.out.println("M��teri kaydedildi : ");
	}
	public void Delete() {
		
		System.out.println("M��teri silindi : ");
	}
	
	public void GiveCredit() {
		
		_creditManager.Calculate();
		System.out.println("Kredi Verildi");
	}
}