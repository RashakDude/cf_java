package levelA;

import java.util.Scanner;

public class CF287A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String s = sc.next();
            for (int j = 0; j < 4; j++) {
                arr[i][j] = s.charAt(j);
            }
        }
        boolean found = false;
        for(int i = 0; i < 3 && !found; i++) {
            for(int j = 0; j < 3 && !found; j++) {
                int b = 0;
                int w = 0;
                if (arr[i][j] == '.') w++; else b++;
                if (arr[i+1][j] == '.') w++; else b++;
                if (arr[i+1][j+1] == '.') w++; else b++;
                if (arr[i][j+1] == '.') w++; else b++;
                if (w != b) found = true;
            }
        }
        if(found) System.out.println("YES");
        else System.out.println("NO");
    }
}
