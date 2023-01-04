package BasamakToplami;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        int total=0,z,number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        number = scanner.nextInt();

        do {
            z = number%10;
            total += z;
            number = number / 10;
            z=0;
        }while (number>0);

        System.out.println(total);



    }
}
