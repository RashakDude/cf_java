package levelA;

import java.util.Scanner;

public class CF218A {
    public static void main(String[] args) throws NullPointerException{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        int[] mountains = new int[2 * n + 1];
        for (int i = 0; i < mountains.length; i++) mountains[i] = scan.nextInt();
        int i =1;
        while(count < k && i < mountains.length-1) {
            if(mountains[i] - 1 > mountains[i-1] && mountains[i] - 1 >mountains[i+1]) {
                mountains[i]--;
                count++;
            }
            i++;
        }
        for (int i1 = 0; i1 < mountains.length; i1++) System.out.print(mountains[i1] + " ");
    }
}
