package ForDongusu;

import java.util.Scanner;

public class ForDongusu {
    public static void main(String[] args) {

        int n, div = 0, result = 0;
        double average;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                result = result+i;
                div += 1;
            }
        }
        average=result/div;
        System.out.println("Ortalama: "+ average);
    }

}
