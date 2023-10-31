package workshop.workshop04;

public class Fibonacci {

    /*
    Write a Java function to print first 100 numbers in Fibonacci series?
     */

    public static void main(String[] args) {
        int n = 15;
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.println("Here is Fibonacci series till " + n + ":" );

        for(int i=1; i <= n; ++i){
            System.out.print(firstNumber + ", ");
            int nextNumber = firstNumber + secondNumber ;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
}}
