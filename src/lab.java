import java.util.Scanner;

public class lab {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i < n; i++) {
            boolean a = true;
            int q = (int) Math.sqrt(i);
            for (int j = 2; j <= q; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println(i + " простое");
            }
        }
    }
}

