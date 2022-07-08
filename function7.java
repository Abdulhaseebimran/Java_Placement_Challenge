import java.util.Scanner;

public class function7 {
    public static int getGreater(int a , int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter 2 number : ");
     int a = sc.nextInt();
     int b = sc.nextInt();

     // calling function
     System.out.println("Greater number is : "+getGreater(a, b));
   }   
}
