package levelA;

import java.util.HashMap;
import java.util.Scanner;

public class CF296A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        HashMap<Integer,Integer> h = new HashMap<>();
        int current;
        for (int i = 0; i < n; i++) {
            current = s.nextInt();
            if (h.containsKey(current)) h.replace(current,h.get(current)+1);
            else h.put(current,1);
        }
        int max = Integer.MIN_VALUE;
        int tot = 0;
        for(int val : h.values()){
            tot += val;
            if (val > max) max = val;
        }
        tot -= max;
        if (tot >= max-1) System.out.println("YES");
        else System.out.println("NO");
    }
}
