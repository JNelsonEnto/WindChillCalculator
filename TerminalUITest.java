/**
 * Auto Generated Java Class.
 */
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Scanner;
public class TerminalUITest {
  
  Scanner in = new Scanner(System.in);
  @Test
  public void promptForDouble(){
    
    assertEquals(" promptForDouble(2.51)", 2.51, TerminalUI.promptForDouble(in, "Test", "cm"), .01);
  }
  
  @Test
  public void promptForString(){
  }
  
  @Test
  public void promptForUnitlessInt(){
  }
  /* ADD YOUR CODE HERE */
  
}
