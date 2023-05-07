package levelA;

import java.util.Scanner;

public class CF799A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        int x = (t+d) / t;
        int z = x * k;
        if (z < n) System.out.println("YES");
        else System.out.println("NO");
    }
}
