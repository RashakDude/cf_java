package levelA;

import java.util.Scanner;

public class CF707A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean color = false;
        int n = s.nextInt();
        int m = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                String x = s.next();
                if (x.charAt(0) == 'Y' || x.charAt(0) == 'C' || x.charAt(0) == 'M') {
                    color = true;
                }
            }
        }
        if (!color) System.out.println("#Black&White");
        else System.out.println("#Color");
    }
}
