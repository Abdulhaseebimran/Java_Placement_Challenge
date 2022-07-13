import java.util.Scanner;

public class bitmask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper = 1 => set || oper = 0 => clear 
        int n = 5;
        int posit = 1;
        int bitmask = 1<<posit;

        if(oper == 1){
            // set
            int newNumber = bitmask | n;
            System.out.println(newNumber);
        } else {
            // clear 
            int newBitMask = ~(bitmask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }

    }
}
