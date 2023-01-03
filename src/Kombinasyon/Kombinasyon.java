package Kombinasyon;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {

        int n,r,z,dif,nTotal=1,rTotal=1,difTotal=1;
        double result;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Kombinasyon için sırasıyla n ve r değerlerini giriniz: ");
        n=scanner.nextInt();
        r=scanner.nextInt();
        dif= n-r;
        for(int i=1;i<=n; i++){
            nTotal = nTotal*i;
        }
        for(int j=1;j<=r; j++){
            rTotal = rTotal*j;
        }
        for(int k=1;k<=dif; k++){
            difTotal = difTotal*k;
        }
        result = nTotal/(rTotal*difTotal);
        System.out.println("Kombinasyon sonucu: " + result);










    }
}
