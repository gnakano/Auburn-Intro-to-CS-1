import java.util.Scanner;
/**
* Convert user input to various String conversion method.
* Conversion is based on user choice input.
*
*
* Activity 3
* @author Genji Nakano - CPSC 1213 - AO1
* @version January 29, 2019
*/

public class MessageConverter {
/**
* Request user input to do string conversion on. 
* If else that gives user 5 choices that will convert strings include
* Trimmed, upper case, lower case, replacing letters, 
* Take out first and last characters of a string and return substring
* Also returns a Error statement if user enters something other than 1 - 5
*
*
* @param args Standard commandline arguments.
*/
   public static void main(String[] args) {
     // variables to declare
     // create Scanner object to capture user input
      Scanner userInput = new Scanner(System.in);
     // create empty String object to capture user input
      String message = "";
     // an int representing the type of output the user wants
      Integer outputType;
      String result = "";
   
      // output message to user to type message
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      // output to user to choices on what to do with string
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      
      // assigning user input to be wrpped into an Integer object
      outputType = Integer.parseInt(userInput.nextLine());
      
      // if statement based on users outut
      if (outputType == 0) {
         result = message;
      } else if (outputType == 1) {
         result = message.trim();
      } else if (outputType == 2) {
         result = message.toLowerCase();
      } else if (outputType == 3) {
         result = message.toUpperCase();
      } else if (outputType == 4) {
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      } else if (outputType == 5) { // replace first and last using substrings
         result = message.substring(1, message.length() - 1);
      } else { // if user input anything other than 1 - 5
         result = "Error: Invalid choice input.";
      }
      // output to user
      System.out.println("\n" + result);
      
      
   }
   
}