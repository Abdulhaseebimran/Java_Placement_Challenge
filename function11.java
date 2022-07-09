import java.util.Scanner;

public class function11 {
    // Write a program to enter the numbers till the user wants and at the end
    //  it should display the count of positive, negative and zeros entered. 
    public static void main(String[] args) {
        int positive = 0, negative = 0, zeros = 0;
        System.out.println("Press 1 to continue or 0 to stop");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while (input == 1) {
            System.out.println("Enter Number : ");
            int number = sc.nextInt();

            if (number > 1) {
                positive++;
            } else if (number < 0){
              negative++;
            } else {
                zeros++;
            }
            System.out.println("Press 1 to continue or 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("positive" +positive);
        System.out.println("negative" +negative);
        System.out.println("zeros" +zeros);
    }
}
