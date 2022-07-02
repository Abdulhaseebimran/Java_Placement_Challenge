import java.util.*;
public class table {
    public static void main(String args[]){
        // print table 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number to print the table :-");
        int n = sc.nextInt();
         
        // int n = 0;
        for (int i = 1; i < 11; i++){
            System.out.println(i*n);
        }
    }
}
