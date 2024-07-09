import java.util.Scanner;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature (in Celsius): ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        System.out.print("Enter temperature (in Fahrenheit): ");
        double fahrenheitInput = sc.nextDouble();

        double celsiusInput = fahrenheitToCelsius(fahrenheitInput);
        System.out.println("Temperature in Celsius: " + celsiusInput);
    }
}

