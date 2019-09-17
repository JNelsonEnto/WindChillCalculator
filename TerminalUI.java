/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class TerminalUI {
  
  Scanner in = new Scanner(System.in);
  
  /* ADD YOUR CODE HERE */
  public static double promptForDouble(Scanner keyboard, String message, String units){
    double prompt = 0.0;
    System.out.print(message + "(" + units + "): ");
    prompt = keyboard.nextDouble();
    return prompt;
  }
  public static String promptForString(Scanner keyboard, String message){
    String prompt = "prompt";
    System.out.print(message + " ") ;
    prompt = keyboard.next();
    return prompt;
  }
  public static int promptForUnitlessInt(Scanner keyboard, String message){
    int prompt = 0;
    System.out.print(message + " ") ;
    prompt = keyboard.nextInt();
    return prompt;
  }
  
}
