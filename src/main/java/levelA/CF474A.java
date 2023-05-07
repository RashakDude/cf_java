package levelA;

import java.util.Scanner;

public class CF474A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String shift = input.next();
        String str = input.next();

        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl;";
        String s3 = "zxcvbnm,./";

        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String x = findString(c, s1, s2, s3);
            int index = x.indexOf(c);
            if (shift.equals("R")) {
                newString.append(x.charAt(index - 1));
            } else if (shift.equals("L")) {
                newString.append(x.charAt(index + 1));
            }
        }
        System.out.println(newString);

    }

    private static String findString(char c, String s1, String s2, String s3) {
        if (s1.contains(String.valueOf(c)))
            return s1;
        else if (s2.contains(String.valueOf(c)))
            return s2;
        return s3;
    }
}
