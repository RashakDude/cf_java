package levelA;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CF43A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int goals = s.nextInt();

        HashMap <String,Integer> hashMap = new HashMap<>();
        Set<String> set = new HashSet<>();

        String current;

        for (int i = 0; i < goals; i++) {
            current = s.next();
            set.add(current);
            if (hashMap.containsKey(current)) {
                hashMap.replace(current, hashMap.get(current)+1);
            } else {
                hashMap.put(current, 1);
            }
        }

        String team1 = set.toArray()[0].toString();
        if (set.size() == 1) {
            System.out.println(team1);
        } else {
            String team2 = set.toArray()[1].toString();
            if (hashMap.get(team1) > hashMap.get(team2)) {
                System.out.println(team1);
            } else {
                System.out.println(team2);
            }
        }
    }
}
