package HarmonikSeri;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {

        int n;
        double result=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harmonik seri için bir n sayısı girin: ");
        n = scanner.nextInt();

        for(double i=1; i<=n; i++){
            result = result + (1/i);
        }
        System.out.println("Harmonik Seri Toplamı: "+result);
    }
}
