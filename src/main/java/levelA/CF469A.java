package levelA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        int a = sc.nextInt();
        for (int i = 0; i < a; i++) s.add(sc.nextInt());
        int b = sc.nextInt();
        for (int i = 0; i < b; i++) s.add(sc.nextInt());
        if (s.size() == n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");
    }
}
