import java.util.Scanner;

public class greeting {
    public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
       int button = sc.nextInt();

       if (button == 1) {
        System.out.println("Hello");
       }  else if(button == 2) {
         System.out.println("Aslam alikum");
       } else if (button == 3) {
        System.out.println("Bonjour");
       } else {
        System.out.println("Oops YOU CLICK THE WRONG BUTTON PLZ CLICK THE RIGHT BUTTON !");
       }
    }
}
