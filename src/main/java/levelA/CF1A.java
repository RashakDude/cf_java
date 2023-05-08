package levelA;

import java.util.Scanner;

public class CF1A {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double n, b, a;
        a = input.nextInt();
        b = input.nextInt();
        n = input.nextInt();
        long res = (long) (Math.ceil(a/n) * Math.ceil(b/n));
        System.out.println(res);
    }
}
