//�irket m��teri nesnesinden inherite olur
public class Company extends Customer{
	//bir s�n�f sadece bir s�n�f� inherite edebilir
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
