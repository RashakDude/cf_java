package levelA;

import java.util.Scanner;

public class CF344A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        String temp = sc.next();
        for (int i = 1; i < n; i++) {
            String s = sc.next();
            if (!s.equals(temp)) {
                count++;
                temp = s;
            }
        }
        System.out.println(count);
    }
}
