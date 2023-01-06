package EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {

        int n,r,upLimit=0 ,max=0,i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("EBOB ve EKOK'u bulunacak 2 sayı giriniz: ");
        n = scanner.nextInt();
        r = scanner.nextInt();

        if(n>=r){
            upLimit = n;
        }
        else {
            upLimit = r;
        }

        while (i<upLimit){
            if(n%i ==0 & r%i == 0) {
                max = i;
            }
            i ++;
        }
        System.out.println("EBOB: " + max);
        System.out.println("EKOK: " + (n*r/max));
    }
}
