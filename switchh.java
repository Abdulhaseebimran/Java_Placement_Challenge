import java.util.Scanner;

public class switchh {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        switch (button){
            case 1 : System.out.println("Hi");
            break;

            case 2 : System.out.println("Aslam alikum");
            break;

            case 3 : System.out.println("Bonjour");
            break;

            default : System.out.println("Oops you click invalid button");
        }
    } 
}
