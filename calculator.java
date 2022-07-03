import java.util.*;
// import javax.xml.transform.Source;

public class calculator {
    public static void main (String args[]){
        // calculator in java
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number :-");
       int a = sc.nextInt();
       int b = sc.nextInt();

       System.out.println("Enter Operators :-");
       int Operators = sc.nextInt();

       switch(Operators){
        case 1 : System.out.println(a+b);
        break;

        case 2 : System.out.println(a-b);
        break;

        case 3 : System.out.println(a*b);
        break;

        case 4 : if( b==0 ){
            System.out.println("Invalid division");
        } else {
             System.out.println(a/b);
        } 
         
        case 5 : if (b == 0) {
            System.out.println("Invalid Division");
        } else {
            System.out.println(a%b);
        } 
         default : System.out.println("Invalid Operators");
       }
    }
}
