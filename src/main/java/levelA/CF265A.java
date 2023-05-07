package levelA;

import java.util.Scanner;

public class CF265A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        String g = s.substring(0,1);
        int j = 0;
        for (int i = 0; i < t.length(); i++){
            if (t.substring(i, i+1).equals(g)){
                j++;
                g = s.substring(j, j+1);
            }
        }
        System.out.println(j+1);
    }
}
