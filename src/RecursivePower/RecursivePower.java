package RecursivePower;

import java.util.Scanner;

public class RecursivePower {
    static int power(int base,int pow){
        int result;
        if(pow == 0){
           result = 1;
        } else {
            result = base * power(base,pow -1);
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Taban değerini giriniz: ");
        int base = scanner.nextInt();
        System.out.println("Üs değerini giriniz: ");
        int pow = scanner.nextInt();

        System.out.println(power(base,pow));

    }
}
