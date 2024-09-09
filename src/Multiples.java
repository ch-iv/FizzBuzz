public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            count += (i % 3 == 0 || i % 5 == 0) ? 1 : 0;
        }
        System.out.println(count);
    }
}
