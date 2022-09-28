package week2;

import javax.imageio.spi.IIORegistry;

public class VariableArgumentsVideo27 {

	
	public static void main(String[] args) {
			
		 System.out.println();

	        System.out.println(sum(5,3));
	        System.out.println(sum(2,7,5));
	        System.out.println(sum(2,3,9,7));
}
	public static int sum(int...numbers) {
		int sum=0;
		for(int number:numbers) {
			sum+=number;
			
			
		}
		return sum;
	}
}