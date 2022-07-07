import java.util.Scanner;

public class function2 {
    public static int sumCalculate(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number to calculate sum");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = sumCalculate(a, b);
        System.out.println("Sum of two number is : "+sum);
    }
}
