package NotOrtalamasıHesaplama;

import java.util.Scanner;

public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {

        int mat,fizik,tarih,muzik,turkce,kimya;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = scanner.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = scanner.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();

        int ort = mat+kimya+fizik+muzik+tarih+turkce;

        System.out.println(ort>60 ? "Sinifi Gecti":"Sınıfta Kaldı");

    }

}