import java.util.Scanner;
public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");12
        // Read the Fahrenheit degree as a double
        double fahrenheitDegree = scanner.nextDouble();
        // Convert Fahrenheit to Celsius
        double celsiusDegree = convertToFahrenheit(fahrenheitDegree);
        // Display the result
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius%n", fahrenheitDegree, celsiusDegree);
                // Close the scanner to avoid resource leak
                scanner.close();
    }
    // Function to convert Fahrenheit to Celsius
    private static double convertToFahrenheit(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}