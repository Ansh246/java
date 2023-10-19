public class Temperature {
    public static void main(String[] args) {
        // Define a temperature in Celsius
        double celsiusTemperature = 25.0;

        // Convert Celsius to Fahrenheit
        double fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);

        // Convert Fahrenheit back to Celsius
        double convertedCelsiusTemperature = fahrenheitToCelsius(fahrenheitTemperature);

        // Print the results
        System.out.println("Celsius: " + celsiusTemperature);
        System.out.println("Fahrenheit: " + fahrenheitTemperature);
        System.out.println("Converted Celsius: " + convertedCelsiusTemperature);
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
