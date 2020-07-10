/** 
 * UserInfo - creates new UserInfo objects.
 * Constructor takes 2 arguments(firstName, lastName)
 * users can set age, location, status using class methods
 * 
 *
 * Activity 4
 * @author Genji Nakano - CPSC 1213 - AO1
 * @version February 7, 2019
 */


public class UserInfo {
// instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;

// constructor
/** 
*Constructor: sets the initial user with 
* first and last name.
*@param firstNameIn = firstName
*@param lastNameIn = lastName
 */
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }

// methods
/** 
* toString prints out info of object.
* 
* 
* @return firstName, lastName, location,age and status
 */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
   
   public void example(int x, int y) {
      while (x < 5) {
         if (x == y || x == 1) {
            y++;
         } else if (x == y && y == 1) {
            y += x;
         } else {
            y--;
         }
         x++;
      }
      System.out.println(x + "--" + y);
   }
   
  /** 
* setLocation: sets users location.
* 
* @param locationIn = sets users location
 */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
 /** 
* setAge: sets age of users.
* checks with if statement if user is above 0
* 
* 
* @param ageIn = users age
* @return isSet = true or false based on users age
 */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
   
  /** 
* getAge gets users age.
* 
* 
* @return age = users age
 */
   public int getAge() {
      return age;
   }
   
   /** 
* getLocation gets Users location.
* 
* 
* @return location = users location
 */
   public String getLocation() {
      return location;
   }
   
  /** 
* logOff changes status OFFLINE.
* 
* 
 */
   public void logOff() {
      status = OFFLINE;
   }
   
  /** 
* logOff status to ONLINE.
* 
* 
 */
   public void logOn() {
      status = ONLINE;
   }

}