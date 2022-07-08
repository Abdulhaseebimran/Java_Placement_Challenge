import java.util.Scanner;

public class function5 {
    public static void printAverage(int a, int b,int c){
        int average = (a + b + c) / 3;
        System.out.println("Average of the given number is : "+average);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number to print average : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        printAverage(a, b, c);
    }
}
