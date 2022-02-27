import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 55;
        System.out.println("число " + processing(n));

    }

    public static int processing (int max){
        int buff = 0;
        boolean[] isPrime = new boolean[max];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]){
                for (int j = 2 * i; j < max; j += i){
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i < max; i++) {
            if (isPrime[i]){
                buff++;
            }
        }

        return buff;
    }
}
