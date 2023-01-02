package Siralama;

import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        int s1,s2,s3;
        String sira;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sırayla 3 Sayı Giriniz: ");
        s1 = scanner.nextInt();
        s2 = scanner.nextInt();
        s3 = scanner.nextInt();

        sira = s1+"<"+s2+"<"+s3;

        if(s2<s1){
            sira=s2+"<"+s1+"<"+s3;
            if(s3<s2){
                sira = s3+"<"+s2+"<"+s1;
            }
            else if(s3>s2 && s3<s1){
                sira = s2+"<"+s3+"<"+s1;
            }
            else {
                sira=s2+"<"+s1+"<"+s3;
            }
        }
        else {
            sira = s1+"<"+s2+"<"+s3;
            if(s3<s1){
                sira=s3+"<"+s1+"<"+s2;
            }
            else if(s3>s1 && s3<s2){
                sira=s1+"<"+s3+"<"+s2;
            }
            else {
                sira = s1+"<"+s2+"<"+s3;
            }
        }
        System.out.println("Sıralama: " + sira);
    }
}
