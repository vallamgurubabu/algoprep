package Arrays.TwoDArray;

import java.util.Scanner;

public class Array_rotation90degrees {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        s.close();
        
        int[][] trans = transpose_matrix(a);
        for (int i = 0; i < n; i++) {
            int[] temp = trans[i];
            int st = 0;
            int en = temp.length - 1;
            while (st < en) {
                int t = temp[st];
                temp[st] = temp[en];
                temp[en] = t;
                st++;
                en--;
            }
            trans[i] = temp;
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose_matrix(int a[][]) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        return a;
    }
}
