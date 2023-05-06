package levelA;

import java.util.Scanner;

public class CF734A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String temp = sc.next();
        int res = 0;
        for(int i = 0; i < count; i++) {
            if (temp.charAt(i) == 'A') res++;
            else res--;
        }
        if (res > 0) System.out.println("Anton");
        else if (res < 0) System.out.println("Danik");
        else System.out.println("Friendship");
    }

}
