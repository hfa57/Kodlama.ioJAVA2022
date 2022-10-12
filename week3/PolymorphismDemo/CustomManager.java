
public class CustomManager {
	
	private BaseLogger logger;
	
	public CustomManager(BaseLogger logger) {
		this.logger=logger;
	}
	
	public void Add() {
		System.out.println("Customer added...");
		this.logger.Log("log message");
		
	}

}
