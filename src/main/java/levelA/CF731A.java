package levelA;

import java.util.Scanner;

public class CF731A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        int count = Math.min(Math.abs(temp.charAt(0)-'a'), 26-Math.abs(temp.charAt(0)-'a'));
        for (int i = 1; i < temp.length(); i++) {
            int res = Math.abs(temp.charAt(i) - temp.charAt(i-1));
            count += Math.min(res, 26-res);
        }
        System.out.println(count);
    }
}
