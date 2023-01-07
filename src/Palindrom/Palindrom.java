package Palindrom;

import java.util.Scanner;

public class Palindrom {
    static boolean isPalindrom(int number){
        int temp = number,reverseNumber=0,lastNumber;
        while (temp !=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber*10) + lastNumber;
            temp = temp /10;
        }

        return number == reverseNumber ? true:false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        if(isPalindrom(number)){
            System.out.println(number + " Palindrom bir sayıdır.");
        }
        else {
            System.out.println(number + " Palindrom bir sayı değildir.");
        }
    }
}
