package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        int n,p=0,r=1,s=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fibonacci Serisini kaça kadar devam ettirmek istiyorsunuz? :");
        n = scanner.nextInt();

        for(int i=1; i<=n ; i++){
            s = p + r;
            p = r;
            r = s;
            System.out.println(p+" + "+ r +" = "+ s);

        }
    }
}
