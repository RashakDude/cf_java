package levelA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next().toLowerCase();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(s.charAt(i));
        if (set.size() == 26) System.out.println("YES");
        else System.out.println("NO");
    }
}
