public class bitmask3 {
    public static void main(String[] args) {
        // clear bit
        int n = 5;
        int posit = 2;
        int bitmask = 1<<posit;
        int notBitMask = ~(bitmask);

        int newNumber = notBitMask & n;
        System.out.println(newNumber);
    }
}
