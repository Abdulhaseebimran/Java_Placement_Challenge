import java.util.Scanner;

public class bio_data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Your Father Name : ");
        String fName = sc.nextLine();

        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();

        System.out.println("Enter Your University Name : ");
        String uni = sc.nextLine();

        System.out.println("Enter Your Hobbie : ");
        String hob = sc.nextLine();

        System.out.println("Enter Your Gender : ");
        String gen = sc.nextLine();

        System.out.println("Enter Your Course Name : ");
        String course = sc.nextLine();

        System.out.println("Enter Your Semester : ");
        int Semester = sc.nextInt();

        // ab print kare ge hum

        System.out.println("Your Name is : " + name);
        System.out.println("Your Father Name is : " + fName);
        System.out.println("Your age is : " + age);
        System.out.println("Your University name is : " + uni);
        System.out.println("Your Hobbie is " + hob);
        System.out.println("Your gender is " + gen);
        System.out.println("Your course is " + course);
        System.out.println("Your semester is " + Semester);
    }
}
