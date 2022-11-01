public class bitmask1 {
    public static void main(String[] args) {
        int n = 5;
        int posit = 3;

        int bitmask = 1 << posit;
      if((bitmask & n) == 0){
        System.out.println("Bit was zero");
      } else {
        System.out.println("Bit was not zero");
      }
    }
}
