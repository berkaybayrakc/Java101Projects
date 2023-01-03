package CiftleriTopla;

import java.util.Scanner;

public class CiftleriTopla {
    public static void main(String[] args) {

        int n,total=0;

        Scanner scanner=new Scanner(System.in);

        do{
            System.out.println("Sayı giriniz: ");
            n=scanner.nextInt();
            if(n%2==0 && n%4==0){
                total += n;
            }
        }while (n%2==0);

        System.out.println("Toplam: " + total);

    }
}
