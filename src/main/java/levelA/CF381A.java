package levelA;
import java.util.Scanner;

public class CF381A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int s = 0, d = 0, f = 0;
        int left = 0, right = n-1;
        while (left <= right) {
            if (f == 0) {
                if (arr[left] > arr[right]) {
                    s += arr[left++];
                } else {
                    s += arr[right--];
                }
            } else {
                if (arr[left] > arr[right]) {
                    d += arr[left++];
                } else {
                    d += arr[right--];
                }
            }
            f ^= 1;
        }
        System.out.println(s + " " + d);
    }
}
