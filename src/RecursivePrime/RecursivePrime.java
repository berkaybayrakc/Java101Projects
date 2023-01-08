package RecursivePrime;

import java.util.Scanner;

public class RecursivePrime {

    static void isPrime(int number,int a){
        int b = number % a;

        if(b==0 && number !=a){
            System.out.println(number + " sayısı ASAL değildir!");
        }

        else if (a < number-1){
            isPrime(number,a+1);
        }
        else {
            System.out.println(number + " sayısı ASALDIR!");
        }

    }

    public static void main(String[] args) {
        int a=2 ,number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        number = scanner.nextInt();

        isPrime(number,a);
    }
}
