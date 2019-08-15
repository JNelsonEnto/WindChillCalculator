import static org.junit.Assert.*;
import org.junit.Test;
public class ConvertTest {
    @Test
    public void fromCelsiusToFahrenheit() {
        assertEquals("fromCelsiusToFahrenheit(100.0)", 212.0, Convert.fromCelsiusToFahrenheit(100.0), 0.01);
        assertEquals("fromCelsiusToFahrenheit(0.0)", 32.0, Convert.fromCelsiusToFahrenheit(0.0), 0.01);
        assertEquals("fromCelsiusToFahrenheit(-17.7778)", 0.0, Convert.fromCelsiusToFahrenheit(-17.7778), 0.01);
        assertEquals("fromCelsiusToFahrenheit(-40.0)", -40.0, Convert.fromCelsiusToFahrenheit(-40.0), 0.01);
        assertEquals("fromCelsiusToFahrenheit(50.0)", -58.0, Convert.fromCelsiusToFahrenheit(-50.0), 0.01);

    }
    @Test
    public void fromFahrenheitToCelsius() {
        assertEquals("fromFahrenheitToCelsius(212.0)", 100.0, Convert.fromFahrenheitToCelsius(212.0), 0.01);
        assertEquals("fromFahrenheitToCelsius(32)", 0.0, Convert.fromFahrenheitToCelsius(32.0), 0.01);
        assertEquals("fromFahrenheitToCelsius(0.0)", -17.7778, Convert.fromFahrenheitToCelsius(0.0), 0.01);
        assertEquals("fromFahrenheitToCelsius(-40.0)", -40.0, Convert.fromFahrenheitToCelsius(-40.0), 0.01);
        assertEquals("fromFahrenheitToCelsius(-58.0)", -50.0, Convert.fromFahrenheitToCelsius(-58.0), 0.01);
    }
    @Test
    public void fromKilometersToMiles() {
        assertEquals("fromKilometersToMiles(1.0000)", 0.6214, Convert.fromKilometersToMiles(1.0000), 0.01);
        assertEquals("fromKilometersToMiles(9.0000)", 5.5923, Convert.fromKilometersToMiles(9.0000), 0.01);
        assertEquals("fromKilometersToMiles(16.0934)", 10.0000, Convert.fromKilometersToMiles(16.0934), 0.01);
        assertEquals("fromKilometersToMiles(80.0)", 49.7097, Convert.fromKilometersToMiles(80.0), 0.01);
    }
    @Test
    public void fromMilesToKilometers() {
        assertEquals("fromMilesToKilometers(0.6214)", 1.0000, Convert.fromMilesToKilometers(0.6214), 0.01);
        assertEquals("fromMilesToKilometers(5.5923)", 9.0000, Convert.fromMilesToKilometers(5.5923), 0.01);
        assertEquals("fromMilesToKilometers(10.0000)", 16.0934  , Convert.fromMilesToKilometers(10.0000), 0.01);
        assertEquals("fromMilesToKilometers(49.7097)", 80.0000, Convert.fromMilesToKilometers(49.7097), 0.01);
    } 
    
    @Test
    public void fromMetersPerSecondToMilesPerHour(){
      assertEquals("fromMetersPerSecondToMilesPerHour(1.3411)", 3.0000, Convert.fromMetersPerSecondToMilesPerHour(1.3411), 0.01);
    }
    
    @Test
    public void fromMilesPerHourToMetersPerSecond(){
      assertEquals("fromMilesPerHourToMetersPerSecond(28.0217)", 12.5268, Convert.fromMilesPerHourToMetersPerSecond(28.0217), 0.01);
    }
}