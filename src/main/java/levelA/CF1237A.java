package levelA;

import java.util.Scanner;

public class CF1237A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextLong();
            sum+=(arr[i]/2);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i] / 2);
            } else{
                if (sum>0 && arr[i] != 0){
                    if (arr[i] > 0){
                        System.out.println((arr[i]/2));
                    }else{
                        System.out.println((arr[i]/2)-1);
                        sum--;
                    }
                } else if (sum <0 && arr[i] != 0){
                    if (arr[i] > 0){
                        System.out.println((arr[i]/2)+1);
                        sum++;
                    } else{
                        System.out.println((arr[i]/2));
                    }
                } else{
                    System.out.println(arr[i]/2);
                }
            }
        }
    }
}
