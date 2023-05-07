package levelA;

import java.util.Arrays;
import java.util.Scanner;

public class CF160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int sum = Arrays.stream(arr).sum();
        int count = 0;
        int res = 0;
        for (int i = n-1; i >= 0; i--) {
            count += arr[i];
            res++;
            if (count > sum - count) {
                System.out.println(res);
                return;
            }
        }
    }
}
