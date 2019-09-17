/**
 * Auto Generated Java Class.
 */
public class Convert {
  
  public static double fromCelsiusToFahrenheit(double c){
    
    return ((9.0/5.0 * c) + 32.0);
  }
  
  public static double fromFahrenheitToCelsius(double f){
    
    return (f - 32) * (5.0 / 9.0) ;
  }
  
  
  public static double fromKilometersToMiles(double km){
    return km * 0.62137;
  }
  
  public static double fromMilesToKilometers(double mi){
    return mi * 1.609;
  }
  
  public static double fromMetersPerSecondToMilesPerHour(double mps){
    return Convert.fromKilometersToMiles((mps * 3600.0 ) / 1000.0);
  }
  
  public static double fromMilesPerHourToMetersPerSecond(double mph){
    return ((Convert.fromMilesToKilometers(mph) / 3600) * 1000);
  }
  
  public static double deca(double base) {
    return base * Math.pow(10, 1);
    
  }
  public static double deci(double base) {
     return base * Math.pow(10, -1);
  }
  public static double hecto(double base){
     return base * Math.pow(10, 2);
  }
  
  public static double centi(double base){
     return base * Math.pow(10, -2);
  }
  
  public static double kilo(double base){
     return base * Math.pow(10, 3);
  }
  
  public static double milli(double base) {
  }
  public static double mega(double base) {
  }
  
  
}
