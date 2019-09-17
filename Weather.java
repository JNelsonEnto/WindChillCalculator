/**
 * Auto Generated Java Class.
 */
import java.lang.Math;
public class Weather {
  
  public static double windChill(double t, double v){
    
    if(t > 50 || v < 4)
      return t;
    else
      return (35.74 + ( 0.6215 * t) - (35.75 * Math.pow(v,0.16)) + ((0.4275 * t)* Math.pow(v,0.16)));
  }
  
  public static boolean isDangerous(double w){
    if ( w < -20.0)
      return true;
    else
      return false;
  }
  
  
}
