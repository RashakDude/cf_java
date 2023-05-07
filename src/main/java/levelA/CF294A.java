package levelA;

import java.util.Scanner;

public class CF294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] birds = new int[n];
        for (int i = 0; i < n; i++) birds[i] = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int index = sc.nextInt();
            int bird = sc.nextInt();
            if (index-2 >= 0) birds[index-2] += bird-1;
            if (index < birds.length) birds[index] += (birds[index-1]-bird);
            birds[index-1] = 0;
        }
        for (int i = 0; i < n; i++) System.out.println(birds[i]);
    }
}
