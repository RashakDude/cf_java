package levelA;

import java.util.Scanner;

public class CF112A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next().toLowerCase();
        String b = sc.next().toLowerCase();
        int len = a.length();
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) > b.charAt(i)) {
                System.out.println(1);
                return;
            } else if (a.charAt(i) < b.charAt(i)) {
                System.out.println(-1);
                return;
            }
        }
        System.out.println(0);
    }
}
