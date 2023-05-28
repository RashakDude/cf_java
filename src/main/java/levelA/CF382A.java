package levelA;

import java.util.Scanner;

public class CF382A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        String spare = sc.next();
        int decimeter = s.indexOf("|");
        for(int i = 0; i < decimeter; i++) s1.append(s.charAt(i));
        for(int i = decimeter + 1; i < s.length(); i++) s2.append(s.charAt(i));
        int i = 0, dif;

        if (s1.length() < s2.length()) {
            dif = s2.length() - s1.length();
            for (; i < spare.length() && i < dif ; i++) s1.append(spare.charAt(i));
        } else {
            dif = s1.length() - s2.length();
            for (; i < spare.length() && i < dif; i++) s2.append(spare.charAt(i));
        }

        if(spare.length() - i > 1 && (spare.length() - i) % 2 == 0) {
            for (int k = i; k < spare.length(); k++) {
                if (k % 2 == 0) s1.append(spare.charAt(k));
                else s2.append(spare.charAt(k));
            }
            System.out.println(s1 + "|" + s2);
        } else if (spare.length() - i == 0 && s1.length() == s2.length()) {
            System.out.println(s1 + "|" + s2);
        } else {
            System.out.println("Impossible");
        }
    }
}
