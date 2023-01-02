package UcakBileti;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int age,km,flightType;
        double totalPrice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Yaş: ");
        age = scanner.nextInt();

        System.out.print("Uçuş Mesafesi(KM): ");
        km = scanner.nextInt();

        System.out.print("Uçuş Tipini Seçiniz (Tek yön için '1',Gidiş Dönüş için '2' yazın: ");
        flightType = scanner.nextInt();

        totalPrice = km*0.10;

        if(km<0 || age<0 || (flightType<0 || flightType>2) ) System.out.println("Hatalı veri girdiniz...");
        else{
            if (age<=12) totalPrice = totalPrice-(totalPrice/2);
            if(age>12 && age<=25) totalPrice = totalPrice - (totalPrice/10);
            if(age>=65) totalPrice = totalPrice -(totalPrice*3/10);

            if(flightType == 2) totalPrice = 2*(totalPrice -(totalPrice/5));

            System.out.println("Toplam Tutar: " + totalPrice);
        }

    }
}
