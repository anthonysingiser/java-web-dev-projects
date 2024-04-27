package org.launchcode;

public class Temperature {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            try {
                throw new TemperatureException.BelowAbsoluteZeroException("Temperature is below absolute zero.");
            } catch (TemperatureException.BelowAbsoluteZeroException e) {
                e.printStackTrace();
            }
        }

        fahrenheit = aFahrenheit;
    }
}
