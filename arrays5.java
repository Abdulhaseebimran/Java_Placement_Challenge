import java.util.Scanner;

public class arrays5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] number = new int [row] [col]; 

        // input 
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                number[i][j] = sc.nextInt();
            }
         }
         int x = sc.nextInt();
         // output
         for(int i=0; i<row; i++){
             for(int j=0; j<col; j++){
                 // compare with x 
                 if(number[i][j] == x){
                     System.out.println("x fonud at location (" + i + ", " + j + ") ");
                 }
             }
         }
    }
}
