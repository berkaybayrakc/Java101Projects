package BurcBulma;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);
        int ay, gun;

        System.out.print("Hangi ay doğdunuz(sayı olarak giriniz)  :");
        ay = veri.nextInt();
        System.out.print("Hangi gün doğdunuz(sayı olarak giriniz)  :");
        gun = veri.nextInt();


        boolean hata = false;
        String burc = "";

        if (ay == 1)    //ocak

        {
            if (gun >= 1 && gun < 31) {
                if (gun < 21) {
                    burc = "oğlak";
                } else {
                    burc = "kova";
                }
            } else {
                hata = true;
            }
        } else if (ay == 2) {    //şubat

            {
                if (gun >= 1 && gun < 28) {
                    if (gun < 19) {
                        burc = "kova";
                    } else {
                        burc = "balık";
                    }
                } else {
                    hata = true;
                }
            }


        } else if (ay == 3) {      //mart
            if (gun >= 1 && gun < 31) {
                if (gun < 20) {
                    burc = "balık";
                } else {
                    burc = "koç";
                }
            } else {
                hata = true;
            }

        } else if (ay == 4) {   //nisan
            if (gun >= 1 && gun < 30) {
                if (gun < 20) {
                    burc = "koç";
                } else {
                    burc = "boğa";
                }
            } else {
                hata = true;
            }


        } else if (ay == 5) {  //mayıs
            if (gun >= 1 && gun < 31) {
                if (gun < 21) {
                    burc = "boğa";
                } else {
                    burc = "ikizler";
                }
            } else {
                hata = true;
            }

        } else if (ay == 6) {   //haziran

            if (gun >= 1 && gun < 30) {
                if (gun < 22) {
                    burc = "ikizler";
                } else {
                    burc = "yengeç";
                }
            } else {
                hata = true;
            }


        } else if (ay == 7) {    //temmuz

            if (gun >= 1 && gun < 31) {
                if (gun < 23) {
                    burc = "yenceç";
                } else {
                    burc = "aslan";
                }
            } else {
                hata = true;
            }


        } else if (ay == 8) {   //ağustos

            if (gun >= 1 && gun < 31) {
                if (gun < 22) {
                    burc = "aslan";
                } else {
                    burc = "başak";
                }
            } else {
                hata = true;
            }


        } else if (ay == 9) {  //eylül

            if (gun >= 1 && gun < 30) {
                if (gun < 22) {
                    burc = "başak";
                } else {
                    burc = "terazi";
                }
            } else {
                hata = true;
            }


        } else if (ay == 10) {   //ekim

            if (gun >= 1 && gun < 31) {
                if (gun < 22) {
                    burc = "terazi";
                } else {
                    burc = "akrep";
                }
            } else {
                hata = true;
            }


        } else if (ay == 11) {  //kasım

            if (gun >= 1 && gun < 30) {
                if (gun < 21) {
                    burc = "akrep";
                } else {
                    burc = "yay";
                }
            } else {
                hata = true;
            }

        } else if (ay == 12) {  //aralık

            if (gun >= 1 && gun < 31) {
                if (gun < 21) {
                    burc = "yay";
                } else {
                    hata = true;
                }

            } else {
                hata = true;
            }}

        if (hata) {
            System.out.print("Lütfen değerleri doğru giriniz.");
        } else {
            System.out.print("burcunuz ;" + burc);
        }

    }
}
