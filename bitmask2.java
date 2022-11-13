public class bitmask2 {
    public static void main(String[] args) {
        // set bit 
        int n = 5; // 0101
        int posit = 1;
        int bitmask = 1<< posit;

        int newNumber = bitmask | n;
        System.out.println(newNumber);
    }
}
