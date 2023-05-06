package levelA;

import java.util.Scanner;

public class CF431A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) arr[i] = sc.nextInt();
        int count = 0;
        String temp = sc.next();
        for (int i = 0; i < temp.length(); i++) count += arr[temp.charAt(i)-'1'];
        System.out.println(count);
    }
}
