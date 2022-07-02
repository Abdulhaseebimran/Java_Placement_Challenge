import java.util.*;

public class even_odd {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("This is even number");
        } else {
            System.out.println("This is a odd number");
        }
    }
}
