import java.util.Scanner;
/**
* Using Scanner utility to gather users name, age, sex.
* Then convert age to minutes and centuries and max heart rate.
*
* Activity 2
* @author Genji Nakano - CPSC 1213 - AO1
* @version January 23, 2019
*/

public class AgeStatistics 
{

/**
  * Calculates age and heart rate based on sex using if else statement.
  * Gathers input from users 
  * 
  * 
  * @param args Standard commandline arguments.
  */

   public static void main(String[] args) {
      // Initiating variables.
      // Creating Scanner object called scanner.
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      
      // prompt the user for their name.
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      
      // prompt the user for their age
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      
      // prompt the user for their sex
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      
      // calculate age in minutes (min = yrs * 525600)
      System.out.println("\tYour age in minutes is "
                        + ageInYears * 525600 + " minutes.");
                        
      // calculate age in centuries
      System.out.println("\tYour age in centuries is "
              + (double) ageInYears / 100 + " centuries.");
              
      // display max heart rate
      System.out.print("Your max heart rate is ");
      
      // if-else statement to calculate heart rate based on gender
      if (gender == 1) {
      // female calculation
         maxHeartRate = 209 - (0.7 * ageInYears); 
      
      } else { 
      // male calculation
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      // continue heart rate statement
      System.out.println(maxHeartRate + " beats per minute.");
   }

}