package levelA;

import java.util.Scanner;

public class CF699A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n-1; i++) {
            if (s.charAt(i) == 'R' && s.charAt(i+1) == 'L') res = Math.min(res, (arr[i+1]-arr[i])/2);
        }
        System.out.println(res == Integer.MAX_VALUE ? -1 : res);
    }
}
