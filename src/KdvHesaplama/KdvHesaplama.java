package KdvHesaplama;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar, kdv,kdvTutarı;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ürün Tutarını girin:  ");
        tutar = scanner.nextDouble();

        if(tutar>=0 && tutar<=1000) {
            kdv=0.18;
            kdvTutarı = tutar * kdv;
            System.out.println("KDV tutarı: " + kdvTutarı);
        }
        else if(tutar > 1000) {
            kdv = 0.08;
            kdvTutarı = tutar * kdv;
            System.out.println("KDV tutarı: " + kdvTutarı);
        }

    }

}
