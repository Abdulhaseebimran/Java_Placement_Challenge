import java.util.Scanner;

public class function4 {
    public static void findFactorial (int n){
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        
        int factorial = 1;
        for(int i=n; i>=1; i--){
          factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number two find factorial : ");
        int n = sc.nextInt();
       
       findFactorial(n);
    }
}
