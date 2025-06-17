import java.util.Scanner;

public class PrimeDigitsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Prime digits in the number: ");

        // Process each digit
        boolean found = false;
        int temp = Math.abs(number); // Handle negative numbers
        while (temp > 0) {
            int digit = temp % 10;

            if (isPrime(digit)) {
                System.out.print(digit + " ");
                found = true;
            }

            temp /= 10;
        }

        if (!found) {
            System.out.print("None");
        }

        scanner.close();
    }
    // Method to check if a digit is prime
    static boolean isPrime(int n) {
        return n == 2 || n == 3 || n == 5 || n == 7;
    }
}
