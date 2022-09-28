package MethodOverloading;

public class Main {

    public static void main(String[] args) {
        FourTransactions fourTransactions = new FourTransactions();
        System.out.println(fourTransactions.sum(2, 3, 5));
        fourTransactions.sum(2, 3, 5);
    }
}

