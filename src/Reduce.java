public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        do {
            count++;
            n = n % 2 == 0 ? n / 2 : n - 1;
        } while (n > 0);
        System.out.println(count);
    }
}
