package levelA;

import java.util.Scanner;

public class CF289A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        int l, r;
        for (int i = 0; i < n; i++) {
            l = sc.nextInt();
            r = sc.nextInt();
            sum += (r-l+1);
        }
        if (sum %k !=0) {
            System.out.println(k - (sum % k));
        } else{
            System.out.println(0);
        }
    }
}
