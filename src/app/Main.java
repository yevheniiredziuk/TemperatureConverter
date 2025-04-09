package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Temperature Conversion Application");

        double f = 98.6;
        double c = fahrenheitToCelsius(f);
        System.out.println(f + "°F = " + c + "°C");
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
