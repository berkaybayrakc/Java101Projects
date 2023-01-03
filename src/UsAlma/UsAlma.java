package UsAlma;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {

        int n,r,total=1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Üssü alınacak sayının taban sayısını giriniz: ");
        n=scanner.nextInt();
        System.out.println("Üs değerini girin: ");
        r=scanner.nextInt();

        for(int i=1; i<=r ; i++){
            total *=n;
        }

        System.out.println("SONUC: " + total);

    }
}
