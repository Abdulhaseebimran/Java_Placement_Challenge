import java.util.*;

public class coditional {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age > 18){
            System.out.println("Adult");
        } else  {
         System.out.println("Your are not adult");
        }
    }
}
