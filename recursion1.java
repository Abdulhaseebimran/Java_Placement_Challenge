public class recursion1 {
    public static void PrintNumber (int n) {
        if(n == 0){
            return;   // base case 
        }
        System.out.println(n);
        PrintNumber(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        PrintNumber(n);
    }
}