package levelA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CF71A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(sc.next());
            String temp = words.get(i);
            if (temp.length() > 10) {
                String a = temp.charAt(0) + Integer.toString(temp.length()-2) + temp.charAt(temp.length()-1);
                String remove = words.remove(i);
                words.add(a);
            }
        }
        for (int i = 0; i < n; i++) System.out.println(words.get(i));
    }
}
