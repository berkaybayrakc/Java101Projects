package SinifGecme;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,tarih,turkce,kimya,average,result=0,divElement=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz: ");
        mat = scanner.nextInt();
        if(mat>=0 && mat<=100){
            result += mat;
            divElement +=1;
        }

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scanner.nextInt();
        if(fizik>=0 && fizik<=100) {
            result += fizik;
            divElement += 1;
        }

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = scanner.nextInt();
        if(tarih>=0 && tarih<=100) {
            result += tarih;
            divElement += 1;
        }

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = scanner.nextInt();
        if(turkce>=0 && turkce<=100) {
            result += turkce;
            divElement += 1;
        }

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scanner.nextInt();
        if(kimya>=0 && kimya<=100) {
            result += kimya;
            divElement += 1;
        }

        average = result / divElement;

        if(average>=55){
            System.out.println("Sınıfı geçtiniz tebrikler!");
        }
        else {
            System.out.println("Sınıfta Kaldınız!");
        }

        System.out.println("Ortalamanız: " + average);



    }
}
