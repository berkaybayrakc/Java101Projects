package TersUcgen;

import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç Basamaklı üçgen girmek istediğinizi giriniz: ");
        n = scanner.nextInt();

        for (int i=n; i>=0; i--){
            for (int k=0; k<=n-i  ; k++ ){
                System.out.print(" ");
            }
            for(int j=(2*i+1); j>0 ; j--){
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
