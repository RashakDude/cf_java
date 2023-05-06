package levelA;

import java.util.Scanner;

public class CF231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while (n-- > 0) {
            int count = 0;
            for (int i = 0; i < 3; i++) count += sc.nextInt();
            if (count >= 2) res++;
        }
        System.out.println(res);
    }
}
