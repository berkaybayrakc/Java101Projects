package HesapMakinesi;


import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1.Sayı: ");
        n1 = scanner.nextInt();

        System.out.print("2.Sayı: ");
        n2 = scanner.nextInt();

        System.out.println(" 1) + \n 2) - \n 3) * \n 4) /");
        System.out.print("İşlem seçiniz: ");
        select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Fark: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpım: " + (n1*n2));
                break;
            case 4:
                System.out.println("Bölüm: " + (n1/n2));
                break;

        }


    }
}
