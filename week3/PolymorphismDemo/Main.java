
public class Main {
	public static void main (String[]args){
	
		/*BaseLogger[] loggers=new BaseLogger[] {new FileLogger(),new EmailLoger(),new DatabaseLogger(),new ConsoleLogger()};
		for(BaseLogger logger:loggers) {
			logger.Log("Log message");*/
		}
		CustomManager customerManager=new CustomManager(new DatabaseLogger());
		
		
	}


