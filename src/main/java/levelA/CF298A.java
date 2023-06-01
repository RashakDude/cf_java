package levelA;

import java.util.Scanner;

public class CF298A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ss = sc.next();
        char[] cc = ss.toCharArray();
        int i = 1, s = 0, t = 0;
        for (; i < (n - 1); i++) {
            if (!ss.contains("R")) {
                t = ss.indexOf("L");
                s = ss.lastIndexOf("L") + 1;
                break;
            } else if (!ss.contains("L")) {
                s = ss.indexOf("R") + 1;
                t = ss.lastIndexOf("R") + 2;
                break;
            }

            if (cc[i] == 'R' && cc[i + 1] == 'L') {
                s = ss.indexOf("R") + 1;
                t = i + 1;
                break;
            }
        }
        System.out.println(s + " " + t);
    }
}
