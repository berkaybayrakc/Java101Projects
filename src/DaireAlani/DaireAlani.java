package DaireAlani;

import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {

        final double pi=3.14;
        int a,r;
        double totalArea;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Daire yarıçapını giriniz: ");
        r  = scanner.nextInt();

        System.out.println("Dairenin alfa açısını giriniz: ");
        a = scanner.nextInt();

        totalArea = (pi * (r*r) * a) / 360;
        System.out.println("Daire Alanı: " + totalArea);
    }
}
