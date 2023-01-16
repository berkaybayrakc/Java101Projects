package Transpose;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Matris Boyutlarını giriniz: ");
        int n = scanner.nextInt();
        System.out.println("X");
        int k = scanner.nextInt();

        int [][] array = new int[n][k];
        int [][] transposeArray = new int[k][n];

        for (int i=0; i<n ;i++) {
            int j=0;
            for (j = 0; j < k; j++){
                System.out.print("Dizinin " + i + ".satır ve " + j + ".sütun elemanını girin:");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int r=0;r<n;r++){
            for (int p=0;p<k;p++){
                System.out.print(array[r][p] +" ");
            }
            System.out.println("");
        }
        System.out.println();

        for (int r=0;r<k;r++){
            for (int p=0;p<n;p++){
                transposeArray[r][p] = array [p][r];
                System.out.print(transposeArray[r][p] +" ");

            }
            System.out.println("");
        }


    }
}
