import java.util.Scanner;

public class function9 {
    public static boolean voteEligible(int age){
        if(age > 18){
            System.out.print("You are eligible to vote");
            return true;
        } else {
            System.out.print("You are not eligible to vote");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        voteEligible(age);
    }
}
