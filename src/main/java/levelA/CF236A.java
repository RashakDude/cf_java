package levelA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF236A {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        Set<Character> s = new HashSet<>();
        for (int i = 0; i < temp.length(); i++) {
            s.add(temp.charAt(i));
        }
        if (s.size() % 2 != 0) System.out.println("IGNORE HIM!");
        else System.out.println("CHAT WITH HER!");
    }
}
