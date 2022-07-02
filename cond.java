import java.util.*;
public class cond {
    public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int a = sc.nextInt();
     int b = sc.nextInt();

     if (a == b) {
        System.out.println("A & B is Equal");
     } else {
        if (a > b) {
            System.out.println("A is greater thaen B");
        } else {
            System.out.println("A is Lesser then B");
        } 
             
     }
    }
}
