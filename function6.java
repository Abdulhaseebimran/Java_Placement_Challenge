import java.util.Scanner;

public class function6 {
    // ye function bana waha hey !
    public static void printSum (int n){
        int sum = 0;
        // using loop 
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        printSum(n); // function calling
    }
}
