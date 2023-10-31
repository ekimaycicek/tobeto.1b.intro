package workshop.workshop04;

public class PerfectNumbers {
    /*
    Write a Java program finds first 10 perfect numbers.
     */

        public static void main(String[] args) {
            int[] perfectNumbers = new int[10];
            int perfectNumberCount = 0;
            int number = 2;

            while (perfectNumberCount < 10) {
                int p = 1;
                int temp = number;

                while (temp % 2 == 0) {
                    p++;
                    temp /= 2;
                }

                if (temp == 1) {
                    perfectNumbers[perfectNumberCount++] = number;
                }

                number++;
            }

            System.out.println("The first 10 perfect numbers are:");
            for (int i = 0; i < perfectNumberCount; i++) {
                System.out.println(perfectNumbers[i]);
            }
        }
    }

