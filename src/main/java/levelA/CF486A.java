package levelA;

import java.util.Scanner;

public class CF486A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long fn;
        if (n % 2 == 0) fn = n/2;
        else fn = (-1) * (n/2 + 1);
        System.out.println(fn);
    }
}