import java.util.ArrayList;
/** 
 * Temperature - creates and holds a list of temperatures.
 * 
 *
 * Activity 6
 * @author Genji Nakano - CPSC 1213 - AO1
 * @version February 21, 2019
 */


public class Temperatures {
// instance variables
   private ArrayList<Integer> temperatures = new ArrayList<Integer>();

//methods
/** 
  * Constructor: sets the initial Temperatures ArrayList.
  * takes in ArrayList of integer values. 
  *
  *
  *@param temperaturesIn - sets the temperatures ArrayList
  */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }

/**
*getLowTemp - gets lowest temperature.
*
*@return lowest temp or 0
*/
   public int getLowTemp() {
   // checks to see if temperatures array is empty
      if (temperatures.isEmpty()) {
         return 0; 
      }
      int low = temperatures.get(0);
   // for loop to go through ArrayList
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   
   }

/**
*getHighTemp - gets highest temperature.
*
*@return high or 0 
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
   // use a for each loop
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }

/**
*lowerMinimum - gets lower minimum.
*
*@param lowIn takes in temp to see if lower.
* than what is in the array.
*@return lowin or getLowTemp.
*/
   public int lowerMinimum(int lowIn) {
   
      return lowIn < getLowTemp() ? lowIn : getLowTemp(); 
   }

/**
*higherMaximum - gets higher maximum.
*
*@param  highIn - takes in a temp and compares to.
* highest temp in array.
*@return highIn or getHighTemp() whichever is higher
*/
   public int higherMaximum(int highIn) {
   
      return highIn > getHighTemp() ? highIn : getHighTemp(); 
   }

/**
*toString - String rep of object.
*
*@return - string rep of object.
*/
   public String toString() {
      return "\tTemperatures: " + temperatures
            + "\n\tLow: " + getLowTemp()
            + "\n\tHigh: " + getHighTemp();
   }


}