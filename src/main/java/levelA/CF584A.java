package levelA;

import java.util.Scanner;

public class CF584A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        if (x == 1 && t > 9) System.out.println("-1");
        else if(t<10) {
            for (int i = 0; i < x; i++) System.out.print(t);
        } else {
            System.out.print("1");
            for (int i = 0; i < x-1; i++) System.out.print("0");
        }
    }
}
