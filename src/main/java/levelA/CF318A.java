package levelA;

import java.util.Scanner;

public class CF318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (b <= (a+1)/2) System.out.println(2*b - 1);
        else System.out.println((b - (a+1)/2)*2);
    }
}
