/**
 * Johnathan L. Nelson Ento
 * Basic Metric Converter
 * Originally created for windChillCalculator, eventually expanded to encompass metric base conversin
 */
public class Convert {
  
//Converts from Celsius to Farenheit
  public static double fromCelsiusToFahrenheit(double c){
    
    return ((9.0/5.0 * c) + 32.0);
  }
  //Converts from celsius to fahrenheit
  public static double fromFahrenheitToCelsius(double f){
    
    return (f - 32) * (5.0 / 9.0) ;
  }
  
  //converts from kilometers to miles
  public static double fromKilometersToMiles(double km){
    return km * 0.62137;
  }
  //converts from miles to kilometers
  public static double fromMilesToKilometers(double mi){
    return mi * 1.609;
  }
  
  //converts from meters per second to miles per hour
  public static double fromMetersPerSecondToMilesPerHour(double mps){
    return Convert.fromKilometersToMiles((mps * 3600.0 ) / 1000.0);
  }
  
  //converts from miles to hour to meters per second
  public static double fromMilesPerHourToMetersPerSecond(double mph){
    return ((Convert.fromMilesToKilometers(mph) / 3600) * 1000);
  }
  
  // metric base * 10
  public static double deca(double base) {
    return base * Math.pow(10, 1); 
  }
  
  //metric base / 10
  public static double deci(double base) {
     return base * Math.pow(10, -1);
  }
  
  //metric base * 100
  public static double hecto(double base){
     return base * Math.pow(10, 2);
  }
  
  //metric base / 100
  public static double centi(double base){
     return base * Math.pow(10, -2);
  }
  
  //metric base * 1000
  public static double kilo(double base){
     return base * Math.pow(10, 3);
  }
  
  //metric base / 1000000
  public static double milli(double base) {
	  return 0.0;
  }
  //metric base * 1000000
  public static double mega(double base) {
	  return 0.0;
  }
  
  
}
