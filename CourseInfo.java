/** 
 * Prints a description of the course. 
 *
 * Activity 1
 * @author Genji Nakano - CPSC 1213 - AO1
 * @version January 15, 2019
 */
public class CourseInfo {
   /**
    * Prints course information to std output.
    *
    * @param args Command line arguments (not used).
    */
   public static void main(String[] args) {
     
      // print course description
      System.out.println("This course provides an "
                           + "introduction to Java and ");
      System.out.println("object-oriented programming.");
      
      System.out.println();
   
      // print more course description
      System.out.println("The course also introduces "
         
                          + "the basics of software development.");
      
      
      String shape1 = "Circle";
      String shape2 = "Square";
      String shape3 = "Triangle";
      
      String q4 = shape1.indexOf('i') == 2 || shape3.contains("i") ? "Yes" : "No";
      String q5 = shape2.substring(5).equals("e") && shape2.indexOf('q') == 1 ? "Yes" : "No";
   
      System.out.println("q5 is: " + q5);
      
      
      int i = 0, x = 0, y = 9;
      do {
         switch(y) {
            case 1:
               y++;
            case 2:
               x++;
            default:
               x += 2;
               y++;
         }
         i++;
      } while (i < 3);     
      System.out.println("y is : " + y);
   }
}