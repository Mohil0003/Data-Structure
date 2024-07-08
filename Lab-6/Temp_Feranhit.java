import java.util.Scanner;
public class Temp_Feranhit {

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the type of conversion
        System.out.println("Choose the type of conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        int choice = sc.nextInt();

        // Variable to store temperature
        double temperature, convertedTemperature;

        // Perform the conversion based on user's choice
        switch (choice) {
            case 1:
                // Celsius to Fahrenheit
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                convertedTemperature = celsiusToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit: " + convertedTemperature);
                break;
            case 2:
                // Fahrenheit to Celsius
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                convertedTemperature = fahrenheitToCelsius(temperature);
                System.out.println("Temperature in Celsius: " + convertedTemperature);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}

