import java.util.Scanner;

public class function1 {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = sc.nextLine();

        printMyName(name); // ye hum ne function ko call kiya hey 
    }
}
