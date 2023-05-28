package levelA;

import java.util.Scanner;

public class CF143A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[6];
        for(int i = 0; i < 6; i++) input[i] = sc.nextInt();
        int x = input[0] + input[2] - input[5];
        int y = input[0] + input[3] - input[4];
        int z = input[1] + input[2] - input[4];
        int w = input[1] + input[3] - input[5];
        x = (x % 2 == 0) ? x / 2 : -1;
        y = (y % 2 == 0) ? y / 2 : -1;
        z = (z % 2 == 0) ? z / 2 : -1;
        w = (w % 2 == 0) ? w / 2 : -1;
        if(x < 1 || y < 1 || z < 1 || w < 1 || x > 9 || y > 9 || z > 9 || w > 9 || x == y || x == z || x == w || y == z || y == w || z == w) {
            System.out.println(-1);
        } else {
            System.out.println(x + " " + y);
            System.out.println(z + " " + w);
        }
    }
}
