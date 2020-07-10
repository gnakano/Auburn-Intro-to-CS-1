/**
* NumberOperations - test different number operations on an object.
*
* Activity 5
* @author Genji Nakano - CPSC 1213 - AO1
* @version February 14, 2019
*/
public class NumberOperations {
// instance variabales
   private int number;

/**
* Constructor - sets the NumberOperations class.
*
*
*@param numberIn - number setter
*/
   public NumberOperations(int numberIn) {
      number = numberIn;
   }

// methods
/**
* getValue - gets value.
*
*
*@return - returns number
*/
   public int getValue() {
   
      return number;
   }
   
/**
* oddsUnder - retursn String containoing the Positive.
* odd integers less than the value of number
*
*@return - String with positive odd Integers
*/
   public String oddsUnder() {
   // initialize empty String
      String output = "";
      int i = 0;
      while (i < number) {
      // concatenate value of i if it is an odd number
         if (i % 2 != 0) {
            output += i + "\t";
         }
      // increase i
         i++;
      
      }
   
      return output; 
   
   }


/**
* powersTwoUnder.
* String containing the positive powers of 
* two less than the value of number
*
*@return - output of String
*/
   public String powersTwoUnder() {
   // String variable
      String output = "";
   // int variable
      int powers = 1;
   // loop to go through each number up to the value of the number
      while (powers < number) {
      // concatenate the value of powers to ouput if it is a power of 2
         output += powers + "\t";
      // calculate the next power of two
         powers = powers * 2;
      }
   
      return output; 
   } 
   
/**
* isGreater - checks to see if number is greater.
*
*@param compareNumber - number to compare
*@return - returns 1, -1, 0 
*/
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      } 
      else if (number < compareNumber) {
         return -1;
      }
      else {
         return 0;
      }
   
   }
   
/**
* toString.
*
*
*@return - String representation of object
*/
   public String toString() {
   // [Note that the result of concatenating number, 
   // which is an int, with an empty String is a String.]
      return number + "";
   }


}