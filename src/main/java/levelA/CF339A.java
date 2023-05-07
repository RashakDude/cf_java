package levelA;

import java.util.Arrays;
import java.util.Scanner;

public class CF339A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String sortedS = String.join("+", Arrays.stream(s.split("\\+"))
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .toArray(String[]::new));

        System.out.println(sortedS);
    }
}
