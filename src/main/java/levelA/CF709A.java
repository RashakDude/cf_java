package levelA;

import java.util.Scanner;

public class CF709A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int b = input.nextInt();
        int d = input.nextInt();
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            int orange = input.nextInt();
            if (orange <= b) {
                sum += orange;
            }
            if (sum > d) {
                sum = 0;
                ++count;
            }
        }
        System.out.println(count);
    }
}
