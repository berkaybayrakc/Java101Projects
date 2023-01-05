package AsalSayilar;

import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {

        int n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaça kadar olan asal sayıları yazdırmak istiyorsunuz: ");
        n = scanner.nextInt();

        for(int i=2;i<n;i++){
            boolean isPrime = true;
            for (int j=2;j<i;j++ ){
                if (i%j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(i);
            }

        }

    }
}
