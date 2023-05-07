package levelA;

import java.util.Scanner;

public class CF686A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        long sum = k;
        int x = 0;
        for (int i = 0; i < n; i++) {
            char c = input.next().charAt(0);
            int num = input.nextInt();
            switch (c) {
                case '+': {
                    sum += num;
                    break;
                }
                case '-': {
                    if (sum - num < 0) x++;
                    else sum -= num;
                    break;
                }
            }
        }

        System.out.println(sum + "  " + x);
    }
}
