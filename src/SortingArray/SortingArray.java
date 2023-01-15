package SortingArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();

        int [] array = new int[n];

        System.out.println("Dizinin Elemanlarını giriniz: ");
        for (int i=0; i<array.length; i++) {
            System.out.print((i+1) + ". Elemanı: ");
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.print("Sıralama: ");
        for(int i: array){
            System.out.print( i + " ");
        }
    }
}
