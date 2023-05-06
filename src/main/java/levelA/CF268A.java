package levelA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CF268A {
    public static class Pair<T,X> {
        int first;
        int second;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            pairs.add(new Pair<>());
            pairs.get(i).first = sc.nextInt();
            pairs.get(i).second = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (pairs.get(i).first == pairs.get(j).second) count++;
            }
        }
        System.out.println(count);
    }
}
