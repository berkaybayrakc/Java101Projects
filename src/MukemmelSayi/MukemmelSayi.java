package MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {

        int n ,s = 0;

        Scanner scanner  = new Scanner(System.in);

        System.out.println("Bir Sayı giriniz: ");
        n = scanner.nextInt();

        for (int i=1; i<n ; i ++) {
            if(n%i == 0){
                s += i;
            }
        }
        if(s == n) {
            System.out.println(n + " Mükemmel sayıdır.");
        }
        else {
            System.out.println(n +" Mükemmel sayı değildir.");
        }

    }
}
