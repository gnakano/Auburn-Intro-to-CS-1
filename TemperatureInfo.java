import java.util.ArrayList;
import java.util.Scanner;

/** 
 * TemperatureInfo - tests Temperatures program.
 * 
 *
 * Activity 6
 * @author Genji Nakano - CPSC 1213 - AO1
 * @version February 21, 2019
 */

public class TemperatureInfo {

/**
* Asks user to input temperatures.
* stores temp in Temperatures ojbect
* Asks user for choices to output information
* high, low, all the temp info or end
*
*@param args Command line arguments (not used).
*/
   public static void main(String[] args) {
   // variables
      Scanner userInput = new Scanner(System.in);
      ArrayList<Integer> tempsList = new ArrayList<Integer>();
      
      // do while loop
      String tempInput = "";
      do {
         System.out.print("Enter a temperature (or nothing to end list): ");
         tempInput = userInput.nextLine().trim();
         if (!tempInput.equals("")) {
            tempsList.add(Integer.parseInt(tempInput));
         }
      } while (!tempInput.equals(""));
      
      // creating a Temperatures object called temps
      Temperatures temps = new Temperatures(tempsList);
      
      // choice menu with default set to 'E' for "end"
      char choice = 'E';
      do {
         System.out.print("Enter choice - [L]ow temp, [H]igh temp, " 
                           + "[P]rint, [E]nd: ");
      // assign user input to choice and make it upperCase
      // and return charAt the first position of the userInput
         choice = userInput.nextLine().toUpperCase().charAt(0);
      // switch statement to go through "choice"
         switch (choice) {
            case 'L':
               System.out.println("\tLow is " + temps.getLowTemp());
               break;
         
            case 'H':
               System.out.println("\tHigh is " + temps.getHighTemp());
               break;
         
            case 'P':
               System.out.println(temps);
               break;
         
            case 'E':
               System.out.println("\tDone");
               break;
         
            default:
               System.out.println("\tInvalid choice!");
         }
      
      
      } while (choice != 'E');
      
      
      
      
      
   }
   

}