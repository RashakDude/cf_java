package levelA;

import java.util.Scanner;

public class CF365A {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int n,m;
        n = l.nextInt();
        m = l.nextInt();
        String t;
        int c = 0;
        boolean tr;
        for (int i = 0; i < n; i++) {
            tr = false;
            t = l.next();
            for (int j = 0; j <= m; j++) {
                if(!(t.contains(Integer.toString(j)))){
                    tr = true;
                    break;
                }
            }
            if(!tr){
                c++;
            }
        }
        System.out.println(c);
    }
}
