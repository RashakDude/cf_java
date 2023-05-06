package levelA;

import java.util.Scanner;

public class CF59A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        int lower = 0;
        int upper = 0;
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isUpperCase(temp.charAt(i))) upper++;
            else lower++;
        }
        if (upper <= lower) System.out.println(temp.toLowerCase());
        else System.out.println(temp.toUpperCase());
    }
}
