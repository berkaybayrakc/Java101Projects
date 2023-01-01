package Login;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username, password, newpassword, ans;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        username = scanner.nextLine();

        System.out.print("Şifreniz : ");
        password = scanner.nextLine();

        if(username.equals("patika") && password.equals("12345")){
            System.out.println("Giriş Başarılı!");
        } else {
            System.out.println("Kullanıcı Bilgilerinizi tekrar gözden geçirin...");
            System.out.println("Şifrenizi değiştirmek için 'evet' yazın");
            ans = scanner.nextLine();
            if(ans.equals("evet")){
                System.out.println("Yeni şifrenizi giriniz: ");
                newpassword=scanner.nextLine();

                if(newpassword.equals(password)){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre Oluşturuldu.Yeni şifreniz: " + newpassword);
                }
            }
        }
    }
}
