package levelA;

import java.util.Scanner;

public class CF514A {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if(s.charAt(0) == '9') {
            i = 1;
            sb.append("9");
        }
        for( ; i < s.length(); i++) {
            if(s.charAt(i)-48 >=5) sb.append('9' - s.charAt(i));
            else sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
