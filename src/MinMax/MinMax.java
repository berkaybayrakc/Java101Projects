package MinMax;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        int n,x,max=0,min=320000000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç Sayı girmek istiyorsunuz? :");
        n = scanner.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(i+". sayıyı giriniz: ");
            x=scanner.nextInt();

            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }

        }
        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En küçük Sayı: " + min);

    }
}
