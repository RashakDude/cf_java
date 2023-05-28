package levelA;

import java.util.Scanner;

public class CF682A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long [] a = new long[5];
        long [] b = new long[5];

        for (int i = 1; i <= n; i++) a[i % 5]++;
        for (int i = 1; i <= m; i++) b[i % 5]++;
        System.out.print((a[0] * b[0]) + (a[1] * b[4]) + (a[2] * b[3]) + (a[3] * b[2]) + (a[4] * b[1]));
    }
}
