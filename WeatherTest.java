/**
 * Auto Generated Java Class.
 * @author Johnathan Nelson Ento
 */
import static org.junit.Assert.*;
import org.junit.Test;
public class WeatherTest {
  
  @Test
  public void windChill(){
    assertEquals("windChill(20.0,3.0)", 20.0, Weather.windChill(20.0,3.0), 0.01);
    assertEquals("windChill(50.0,10.0)", 46.0368, Weather.windChill(50.0,10.0), 0.01);
    assertEquals("windChill(50.01,10.0)", 50.01, Weather.windChill(50.01,10.0), 0.01);
    assertEquals("windChill(20.0,5.0)", 12.9812, Weather.windChill(20.0,5.0), 0.01);
    assertEquals("windChill(40.0,45.0)", 26.3080, Weather.windChill(40.0,45.0), 0.01);
    assertEquals("windChill(40.0,35.0)", -13.6380, Weather.windChill(10.0,35.0), 0.01); 
    assertEquals("windChill(-10.0,25.0)", -37.4637, Weather.windChill(-10.0,25.0), 0.01);
  }
  
  @Test
  public void isDangerous(){
     assertEquals("isDangerous(100.0)", false ,Weather.isDangerous(100.0));
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
