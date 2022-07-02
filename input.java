import java.util.Scanner;

public class input {
   // input for users
    public static void main (String [] args){
     Scanner sc = new Scanner(System.in);
     String name = sc.nextLine(); // ye function pora token leta hey 
     System.out.println(name);
     
     int  number = sc.nextInt();
     System.out.println(number);

     float num = sc.nextFloat();
     System.out.println(num);
    }
}
