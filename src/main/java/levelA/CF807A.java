package levelA;

import java.util.Scanner;

public class CF807A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean rated = false, unrated = false;
        int prev, next, lastNext = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            prev = sc.nextInt();
            next = sc.nextInt();
            if (next > lastNext) unrated = true;
            if (prev != next) {
                rated = true;
                break;
            }
            lastNext = next;
        }
        if (rated) System.out.println("rated");
        else if (unrated) System.out.println("unrated");
        else System.out.println("maybe");
    }
}
