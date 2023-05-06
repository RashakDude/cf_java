package levelA;

import java.util.Scanner;

public class CF263A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0, c = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (sc.nextInt() == 1) {
                    r = i;
                    c = j;
                    break;
                }
            }
        }
        System.out.println(Math.abs(r-2) + Math.abs(c-2));
    }
}
