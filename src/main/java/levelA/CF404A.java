package levelA;

import java.util.Scanner;

public class CF404A {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        Character[][] arr = new Character[n][n];

        for (int i = 0; i < n; i++){
            String str = scn.next();
            for (int j = 0; j < str.length(); j++){
                arr[i][j] = str.charAt(j);
            }
        }

        int flag = 0, l = n-1, diag_count = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                char diagonal = arr[0][0];
                char match = arr[0][1];

                if (diagonal == match){
                    flag =1;
                    break;
                }
                if(arr[i][j] != diagonal && arr[i][j] != match){
                    flag=1;
                    break;
                }
                if(arr[i][i] != diagonal ){
                    flag = 1;
                    break;
                }
                if(arr[i][j] == diagonal ){
                    diag_count++;
                }
                if(arr[i][l] != diagonal){
                    flag =1;
                    break;
                }
            }
            l--;
        }
        if (flag == 1) {
            System.out.print("NO");
        } else {
            if (diag_count != (n*2)-1) {
                System.out.print("NO");
            } else{
                System.out.print("YES");
            }
        }
    }
}
