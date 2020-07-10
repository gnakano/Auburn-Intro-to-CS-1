   /** 
 * UserInfo test Driver.
 * Tests code for UserInfo.java
 *
 * Activity 4
 * @author Genji Nakano - CPSC 1213 - AO1
 * @version February 7, 2019
 */


public class UserInfoDriver {
/**
  * Runs two (2) test cases to test UserInfo.java code.
  * Test will create new users with a constructor 
  * Then prints the users info
  * Using class methods sets the location, age, and status
  * prints the final user info with above info added
  *
  * @param args Command line arguments (not used).
  */

   public static void main(String[] args) {
   
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
   
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   
   }

}