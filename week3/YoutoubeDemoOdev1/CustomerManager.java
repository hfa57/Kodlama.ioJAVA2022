//Katmanlý Mimariler 
public class CustomerManager {
//constructor'lar void olmadan class'ýn ismiyle ayný olucak þekilde yazýlýyorlar
	private Customer _customer;//private sadece bu class'ýn içinde çalýþabilir demek 
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {//interfac'ler referans tiptir
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save() {
		
		System.out.println("Müþteri kaydedildi : ");
	}
	public void Delete() {
		
		System.out.println("Müþteri silindi : ");
	}
	
	public void GiveCredit() {
		
		_creditManager.Calculate();
		System.out.println("Kredi Verildi");
	}
}