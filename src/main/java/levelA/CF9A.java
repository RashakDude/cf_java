package levelA;

import java.util.Scanner;

public class CF9A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = Math.max(a, b);
        int c = 7 - m;
        if (6 % c == 0) System.out.println(1 + "/" + 6/c);
        else if (c % 2 == 0) System.out.println(c/2 + "/" + 3);
        else System.out.println(c + "/" + 6);
    }
}
