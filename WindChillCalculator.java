/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class WindChillCalculator {
  
  static Scanner in = new Scanner(System.in);
  
  
  
  
  public static void main(String[] args){
    
    //System.out.Print();
    //System.out.Print();
    //String country = new String();
    String units = new String();
    double temperature = 0.0;
    double windSpeed = 0.0;
    String cOrF = new String();
    String icao = new String();
    double windChill = 0.0;
    boolean danger = false;
    
    
    switch(TerminalUI.promptForUnitlessInt(in,"Canada (0), Mexico (1), or U.S. (2):")){
      case 0:
        units = "km/hr";
        cOrF = "degrees C";
        break;
      case 1:
        units = "m/sec";
        cOrF = "degrees C";
        break;
      default:
        units = "mi/hr";
        cOrF = "degrees F";
    }
    
    temperature = TerminalUI.promptForDouble(in,"Temperature ", cOrF );
    windSpeed = TerminalUI.promptForDouble(in,"Wind Speed ", units);
    icao = TerminalUI.promptForString(in, "Station:");
   
    	//perform conversions if necessary
      if(units == "km/hr")
        windSpeed = Convert.fromKilometersToMiles(windSpeed);
      
      if(units ==  "m/sec")
        windSpeed = Convert.fromMetersPerSecondToMilesPerHour(windSpeed);
      
      if (units != "mi/hr")
        temperature = Convert.fromCelsiusToFahrenheit(temperature);
      
      //calculate windchill
      windChill = Weather.windChill(temperature, windSpeed);
      
      //check if the wind speed is dangerous
      danger = Weather.isDangerous(windChill);
      
      //perform conversion for windchill if necessary
      if (units != "mi/hr")
        windChill = Convert.fromFahrenheitToCelsius(windChill);
    
    //report figures to the user
    System.out.printf("Wind Chill for %s: %6.2f %s",icao, windChill, cOrF );
    if(danger == true)
      System.out.print(" (Be careful!)");
    System.out.print("\n");
    
    in.reset();
    }
    
}
