package gugudan;
import java.util.Random;
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        Random r = new Random();

        int lotto[] = new int[6];
        int check[] = new int[46];

        System.out.println("==============================\n");
        for (int i = 'A'; i <= 'C' ; i++) {
            System.out.print((char) i + " 자 동  ");
            for (int j = 0; j < lotto.length; j++) {
                lotto[j] = r.nextInt(45) + 1;

                if (check[lotto[j]] == 0) {
                    check[lotto[j]] = 1;
            } else
                j--;
        }
            Arrays.sort(lotto);
            for (int j = 0; j < lotto.length; j++) {
                if (lotto[j] < 10) {
                    System.out.print("0" + lotto[j] + " ");
                } else {
                    System.out.print(lotto[j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("==============================");
    }
}
