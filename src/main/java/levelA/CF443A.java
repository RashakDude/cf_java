package levelA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        System.out.println(set.size());
    }
}
