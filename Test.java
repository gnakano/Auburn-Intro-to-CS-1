public class Test {




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
}