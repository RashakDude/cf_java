package levelA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF228A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            s.add(sc.nextInt());
        }
        System.out.println(4 - s.size());
    }
}
