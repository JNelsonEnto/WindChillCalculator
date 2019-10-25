/**
 * Johnathan L. Nelson Ento
 * Terminal User Interface, prompts user for various input
 */
import java.util.Scanner;
public class TerminalUI {
  
  Scanner in = new Scanner(System.in);
  
  //Prompts the user for double precision number
  public static double promptForDouble(Scanner keyboard, String message, String units){
    double prompt = 0.0;
    System.out.print(message + "(" + units + "): ");
    prompt = keyboard.nextDouble();
    return prompt;
  }
  
  //Prompts the user for a string
  public static String promptForString(Scanner keyboard, String message){
    String prompt = "prompt";
    System.out.print(message + " ") ;
    prompt = keyboard.next();
    return prompt;
  }
  
  //prompts the user for a unitless interger
  public static int promptForUnitlessInt(Scanner keyboard, String message){
    int prompt = 0;
    System.out.print(message + " ") ;
    prompt = keyboard.nextInt();
    return prompt;
  }
  
  //prompts the user for a unitless double precision number
  public static double promptForUnitlessDouble(Scanner keyboard, String message){
	    double prompt = 0.0;
	    System.out.print(message + " ");
	    prompt = keyboard.nextDouble();
	    return prompt;
	  }
  
//prompts the user for a double precision number in scientific notation
  public static double promptScientificDouble(Scanner keyboard, String message){
	    double prompt = 0.0;
	    System.out.print(message + " ");
	    prompt = keyboard.nextDouble();
	    return prompt * Math.pow(10, promptForUnitlessInt(keyboard, "What is the power of 10?"));
	  }
}
