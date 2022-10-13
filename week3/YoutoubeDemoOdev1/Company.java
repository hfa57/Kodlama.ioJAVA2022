//þirket müþteri nesnesinden inherite olur
public class Company extends Customer{
	//bir sýnýf sadece bir sýnýfý inherite edebilir
	public String TaxNumber;
	public String CompanyName;

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}
	
}
