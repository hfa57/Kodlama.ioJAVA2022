package week2;


public class MethodsVideo24 {
    public static void main(String[] args) {

        System.out.println();

        

        findNumber(3); 
        findNumber(2);
        findNumber(8);

    }

    
    public static void findNumber(int investigate) {
        int[] numbers = { 1, 2, 5, 7, 9, 0 };
        boolean isExist = false;

        for (int number : numbers) {
            if (number == investigate) {
                isExist = true;
                break;
            }
        }

        if (isExist) {
        	System.out.println("There is the number sought. : " + investigate);
        } else {
        	System.out.println("There isn't the number sought. : " + investigate);;
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }

}
