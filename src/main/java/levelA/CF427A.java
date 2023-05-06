package levelA;

import java.util.Scanner;

public class CF427A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int crimes = 0;
        int police = 0;
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp < 0 && police <= 0) crimes++;
            else if (temp < 0) police--;
            else police += temp;
        }
        System.out.println(crimes);
    }
}
