package levelA;

import java.util.Scanner;

public class CF770A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        StringBuilder s = new StringBuilder();
        int c = 97;
        for (int i = 0; i < n; i++) {
            s.append((char)c);
            c++;
            if (c - 97 >= k) c = 97;
        }
        System.out.println(s);
    }
}
