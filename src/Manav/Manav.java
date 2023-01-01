package Manav;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        double Armut = 2.14 ,Elma = 3.67, Domates = 1.11, Muz =  0.95, Patlıcan = 5.00, tutar;
        int a,b,c,d,e;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? :");
        a=scanner.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        b=scanner.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        c=scanner.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        d=scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        e=scanner.nextInt();

        tutar = (Armut*a) +(Elma*b) +(Domates*c) + (Muz*d) + (Patlıcan*e);
        System.out.println("Toplam Tutar :" + tutar);

    }
}
