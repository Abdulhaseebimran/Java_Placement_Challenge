import java.util.Scanner;

public class recursion4 {
    public static int calfactorial (int n){
         if (n == 1 || n == 0){
            return 1;
         }
        int fact_nm1 = calfactorial(n-1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int number = sc.nextInt();
        // System.out.print("enter the number : ");
        System.out.println(number);
        
        int ans = calfactorial(number);
        System.out.println("The Sum of the given Number is :- "+ ans);
    }
}
