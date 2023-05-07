package levelA;

import java.util.Scanner;

public class CF208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        String temp2 = temp.replaceAll("WUB", " ");
        String temp3 = temp2.replaceAll("  ", " ");
        System.out.println(temp3.trim());
    }
}
