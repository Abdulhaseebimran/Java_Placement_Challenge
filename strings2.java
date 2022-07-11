import java.util.Scanner;

public class strings2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // concatenation
        String firstname = sc.nextLine();
        String Lastname = sc.nextLine();
        String Fullname = firstname + " " + Lastname;
         System.out.println("Your Full Name is " + Fullname);
         System.out.println(Fullname.length());

         // charAt
         for(int i=0; i<Fullname.length(); i++){
            System.out.println(Fullname.charAt(i));
         }
    }
}
