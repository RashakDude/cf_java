package levelA;

import java.util.Scanner;

public class CF225A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        for ( ; k > 0; k--) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == n || b == n || a == (7-n) || b == (7-n)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
