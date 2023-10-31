package workshop.workshop04;

import java.util.Scanner;

public class ArmstrongNumber {
     /*
    Write a Java program to check if the entered number is Armstrong number?
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number, sum = 0;
        int numberOfDigits = (int) Math.floor(Math.log10(number) + 1);

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println("The number " + originalNumber + " is an Armstrong number.");
        } else {
            System.out.println("The number " + originalNumber + " is not an Armstrong number.");
        }
    }
}
