package levelA;

import java.util.Scanner;

public class CF483A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();

        if (l % 2 != 0) l++;
        if (Math.abs(l-r) < 2) System.out.println("-1");
        else System.out.println(l + " " + (++l) + " " + (++l));
    }
}
