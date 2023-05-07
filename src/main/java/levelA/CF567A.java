package levelA;

import java.util.Scanner;

public class CF567A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println((arr[1]-arr[0]) + " " + (arr[n-1]-arr[0]));
        for (int i = 1; i < n-1; i++) System.out.println(Math.min(arr[i]-arr[i-1],arr[i+1]-arr[i]) + " " + Math.max(arr[i]-arr[0],arr[n-1]-arr[i]));
        System.out.println((arr[n-1]-arr[n-2]) + " " + (arr[n-1]-arr[0]));
    }
}
