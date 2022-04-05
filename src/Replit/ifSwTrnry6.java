package Replit;

import java.util.Scanner;

public class ifSwTrnry6 {
    /*Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

Eger aynı karakterlere sahipse

"isim ayni karakterlere sahiptir." yazdirin.

Eger ayni kaakterlere sahip degilse

"Dizenin benzersiz karakterleri var" yazdirin.

Ternary kullanin. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 harfli bir isim giriniz");
        String str=scan.nextLine();

        System.out.println((str.length()<4?str.charAt(0)==str.charAt(1)||str.charAt(1)==str.charAt(2)||
                str.charAt(0)==str.charAt(2)?"İsim ayni karakterlere sahiptir":"Dizenin benzersiz karakterleri vardir":"Yanlis giris yaptiniz"));
    }
}
