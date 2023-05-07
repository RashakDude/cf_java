package levelA;

import java.util.Scanner;

public class CF768A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != min && arr[i] != max) count++;
        }
        System.out.println(count);
    }
}
