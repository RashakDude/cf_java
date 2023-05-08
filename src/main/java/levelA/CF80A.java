package levelA;

import java.util.Scanner;

public class CF80A {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean flag = true;

        if (isPrime(m)) {
            for (int i = n + 1; i < m; i++) {
                if (isPrime(i)) {
                    flag = false;
                    break;
                }
            }
        } else flag = false;
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
