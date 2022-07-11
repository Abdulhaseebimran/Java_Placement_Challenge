import java.util.Scanner;

public class arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        int[][] number = new int [row] [cols];

        // input for rows
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                number[i][j] = sc.nextInt();
            }
        }
        // output
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
