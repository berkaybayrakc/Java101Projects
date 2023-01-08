package DesenMethod;

import java.util.Scanner;

public class DesenMethod {
    static void patternMethod(int n,int a,int firstN) {
        System.out.print(n + " ");
        if (n<=0){
            a =2;
        }
        if (a == 1){
            patternMethod(n-5,a,firstN);
        }
        else if (a==2){
            if(n == firstN){
                System.out.println("");
            }else
            patternMethod(n+5,a,firstN);

        }
    }

    public static void main(String[] args) {
        int a = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();
        int firstN = n;

        patternMethod(n,a,firstN);
    }
}
