package levelA;

import java.util.Scanner;

public class CF1204A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        int s = 0;
        for(int i = 0; i < b.length(); i++) {
            if(b.charAt(i)=='1') s++;
        }
        if (s == 0) System.out.println(0);
        else if (s==1) System.out.println((b.length()/2));
        else System.out.println(((b.length()+1)/2));
    }
}
