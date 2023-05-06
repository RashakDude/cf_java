package levelA;

import java.util.*;

public class CF677A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int res = n;
        while (n-- > 0) {
            int temp = sc.nextInt();
            if (temp > h) res++;
        }
        System.out.println(res);
    }
}
