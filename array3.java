import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :- ");
        int size = sc.nextInt();
        int numbers[] = new int [size];

        // input
        for(int i=0; i<=size; i++){
            numbers[i] = sc.nextInt();
        }
        // output
    //     for(int i=0; i<=size; i++){
    //         System.out.println(numbers[i]);
    //     }
        int x = sc.nextInt();
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index : " + i);
            }
        }
    }
}
