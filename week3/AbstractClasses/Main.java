package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.calculate();
		womanGameCalculator.GameOver();
		
		GameCalculator gameCalculator=new WomanGameCalculator();

	}

}
