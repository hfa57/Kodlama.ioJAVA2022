package intro;

public class MukemmelSayilarOdev18 {

	public static void main(String[] args) {
		int number=5;
		int total=0;
		
		for(int i=1;i<number;i++){
			if(number%i==0) {
				total=total+i;
				
			}
		
		}
		if(total==number) {
			System.out.println("M�kemmel Say�d�r");
			
		}else {
			System.out.println("M�kemmel Say� de�ildir.");
		}
		}
	}


