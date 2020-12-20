package se.iths;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int substrack(int a, int b) {
        return a - b;
    }

    public int multipy(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 2 is " + new Calculator().add(2, 2) + ".");
        System.out.println("2 - 2 is " + new Calculator().substrack(2, 2) + ".");
        System.out.println("2 * 2 is " + new Calculator().multipy(2, 2) + ".");
        System.out.println("2 / 2 is " + new Calculator().divide(2, 2) + ".");
        System.out.println("4 / 2 is " + new Calculator().divide(4, 2) + ".");

    }

}
