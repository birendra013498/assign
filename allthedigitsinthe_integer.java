import java.util.Scanner;
public class allthedigitsinthe_integer {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");
        // Read the integer from the user
        int number = scanner.nextInt();
        // Validate if the entered number is within the specified range
        if (number < 0 || number > 1000) {
            System.out.println("Please enter a valid integer between 0 and 1000.");
        } else {
            // Calculate the sum of digits
            int digitSum = calculateDigitSum(number);
            // Display the result
            System.out.println("The sum of digits in " + number + " is: " + digitSum);
        }
        // Close the scanner to avoid resource leak
        scanner.close();
    }
    // Function to calculate the sum of digits in an integer
    private static int calculateDigitSum(int num) {
        int sum = 0;
        // Iterate through each digit in the number
        while (num > 0) {
            // Extract the last digit
            int digit = num % 10;
            // Add the digit to the sum
            sum += digit;
            // Remove the last digit from the number
            num /= 10;
        }
        return sum;
    }
}