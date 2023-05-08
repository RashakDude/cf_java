package levelA;

import java.util.HashMap;
import java.util.Scanner;

public class CF785A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> hashMap = new HashMap<>();

        hashMap.put("Tetrahedron",4);
        hashMap.put("Cube",6);
        hashMap.put("Octahedron",8);
        hashMap.put("Dodecahedron",12);
        hashMap.put("Icosahedron",20);

        int n = sc.nextInt();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (hashMap.get(sc.next()));
        }

        System.out.println(sum);
    }
}
