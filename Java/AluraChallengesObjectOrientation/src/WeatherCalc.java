public class WeatherCalc implements WeatherConversion {
    @Override
    public double celsiusToFahrenheit(double celcius) {
        return (celcius * ((double) 9 / 5)) + 32;
    }

    @Override
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * ((double) 5 / 9);
    }
}
