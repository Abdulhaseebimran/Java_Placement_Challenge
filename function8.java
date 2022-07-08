import java.util.Scanner;

public class function8 {
    public static Double getCircumferences(Double radius){
        return 2 * 3.14 * radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        Double r = sc.nextDouble();

        System.out.println(getCircumferences(r));
    }
}
