package VucutKitleEndeksi;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

        double kg,m,index;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz(kg): ");
        kg = scanner.nextDouble();

        System.out.println("Boyunuzu giriniz(m): ");
        m = scanner.nextDouble();

        index = kg / m * m;
        System.out.println("Vücut Kitle İndeksiniz: " + index);


    }
}
