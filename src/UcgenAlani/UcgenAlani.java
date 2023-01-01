package UcgenAlani;

import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {

        int a,b,c;
        double u,alan;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını sırasıyla giriniz: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        u=(a+b+c)/2;
        alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}
