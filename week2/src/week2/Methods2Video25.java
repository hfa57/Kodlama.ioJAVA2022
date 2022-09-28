package week2;

public class Methods2Video25 {

	public static void main(String[] args) {
		String message="Today weather is very good.";
		String newMessage=giveCity();
		System.out.println(newMessage);
		int number=sum(5,8);
		System.out.println(number);
	}
	public static void add() {
		System.out.println("Added");
	}
	public static void delete() {
		System.out.println("Deleted");
	}
	public static void update() {
		System.out.println("Updated");
	}
	public static int sum(int number1,int number2) {
		return number1+number2;
	}
	public static String giveCity() {
		return "Ankara";
	}
	

}
