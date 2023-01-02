package CinZodyagi;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {

        int year;
        String cinZodyagi="";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        year = scanner.nextInt();

        if(year%12 == 0) cinZodyagi="Maymun";
        if(year%12 == 1) cinZodyagi="Horoz";
        if(year%12 == 2) cinZodyagi="Köpek";
        if(year%12 == 3) cinZodyagi="Domuz";
        if(year%12 == 4) cinZodyagi="Fare";
        if(year%12 == 5) cinZodyagi="Öküz";
        if(year%12 == 6) cinZodyagi="Kaplan";
        if(year%12 == 7) cinZodyagi="Tavşan";
        if(year%12 == 8) cinZodyagi="Ejderha";
        if(year%12 == 9) cinZodyagi="Yılan";
        if(year%12 == 10) cinZodyagi="At";
        if(year%12 == 11) cinZodyagi="Koyun";

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagi);
    }
}
