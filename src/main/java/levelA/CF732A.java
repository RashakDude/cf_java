package levelA;

import java.util.Scanner;

public class CF732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            int res = a * i;
            if (res % 10 == 0 || res % 10 == b) {
                System.out.println(i);
                return;
            }
        }
    }
}
