package Taksimetre;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int km;
        double perKm = 2.20, total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gidilen mesafeyi giriniz: ");
        km = scanner.nextInt();

        total = 10 + (km*perKm);

        if(total <= 20){
            total = 20;
        }

        System.out.println("Taksimetrenin yazdığı tutar: " + total);
    }

}
