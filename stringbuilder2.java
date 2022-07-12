public class stringbuilder2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2, "n");
        System.out.println(sb);

        // delete 
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
