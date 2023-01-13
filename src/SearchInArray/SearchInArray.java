package SearchInArray;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int n = scanner.nextInt();

        Arrays.sort(array);
        int nMax = array[0];
        int nMin = array[array.length-1];

        for (int i=0; i< array.length ; i ++){

            if (array[i] < n && n > nMax) {
                nMax = array[i];
                nMin = array[i+1];
            }

        }
        System.out.println("Girilen Sayı: " + n);
        System.out.println(n + "'e en yakın büyük sayı: " + nMin);
        System.out.println(n + "'e en yakın küçük sayı: " + nMax);

    }
}
