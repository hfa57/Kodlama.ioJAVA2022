package abstractClasses;

public abstract class GameCalculator {
	public abstract void calculate();
	
	public final void GameOver() {
		System.out.println("Oyun bitti.");
	}
	

}
