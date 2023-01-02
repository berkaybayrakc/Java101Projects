package EtkinlikRehberi;

import java.util.Scanner;

public class EtkinlikRehberi {
    public static void main(String[] args) {

        int celcius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        celcius = scanner.nextInt();

        System.out.println("Hava Sıcaklığına Göre Önerilen Etkinlikler: ");
        if(celcius<=0) System.out.println("-Kayak Yapmak");
        if(celcius>0 && celcius<=15) System.out.println("-Sinema");
        if(celcius>5 && celcius<=25) System.out.println("-Halısaha");
        if(celcius<=15 && celcius<=25) System.out.println("-Piknik");
        if(celcius>=25) System.out.println("-Yüzmek");
        if (celcius>=35) System.out.println("-Güneş Işınlarından kaçınmak.");
    }


}
