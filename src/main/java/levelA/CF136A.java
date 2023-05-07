package levelA;

import java.util.Scanner;

public class CF136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            int index = sc.nextInt();
            arr[index-1] = i;
        }
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
