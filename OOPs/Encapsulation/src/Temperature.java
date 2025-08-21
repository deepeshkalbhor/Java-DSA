/*
Design a class named Temperature. It should store the temperature in Celsius as a private double field.

Create a constructor that takes a Celsius temperature to initialize the object.

Create a public getter getCelsius() that returns the temperature in Celsius.

Create a public getter getFahrenheit() that converts the internal Celsius value to Fahrenheit and returns it. The formula is F = C * 9/5 + 32.

Create a public setter setCelsius(double temp) to modify the temperature.

Create a public setter setFahrenheit(double temp) that accepts a Fahrenheit temperature, converts it to Celsius, and stores it internally. The formula is C = (F - 32) * 5/9.
 */
public class Temperature {
    private double Celsius;

    public Temperature(double Celsius){
        this.Celsius = Celsius;
    }

    public double getCelsius(){
        return this.Celsius;
    }

    public double getFarhenheit(double farhenheit){
        farhenheit = this.Celsius * 9/5 + 32;
        return farhenheit;
    }

    public void setCelsius(double temp){
    }

    public void setFarhenheit(double temp){

    }

}
