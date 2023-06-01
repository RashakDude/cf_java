package levelA;

import java.util.Scanner;

public class CF579A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=0;i<32;i++){
            if((1<<i & n) != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
