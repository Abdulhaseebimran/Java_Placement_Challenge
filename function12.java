import java.util.Scanner;

public class function12 {
    // Two numbers are entered by the user, x and n.
    //  Write a function to find the value of one number raised to the power of another i.e. xn.
    //Try to convert it into a function on your own.
     public static void main(String[] args) {
      System.out.println("Enter x : ");
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      
      System.out.println("Enter n : ");
      int n = sc.nextInt();

      int result = 1;

      for(int i=1; i<=n; i++){
        result = result * x;
      }
      System.out.println("x to the power of n is : " +result);
    }
}
