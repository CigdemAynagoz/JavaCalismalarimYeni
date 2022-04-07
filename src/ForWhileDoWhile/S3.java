package ForWhileDoWhile;

import java.util.Scanner;

public class S3 {
    /*
    TASK :
   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
        hesaplayan kodu yazınız.

        Örnek Ekran Çıktısı
       Girilen sayı=4
       Kareler toplamı=30

    */ // HALUK HOCA 12 soru
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" lutfen pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;

        for (int i = 1; i <=sayi; i++) {
            toplam+=(i*i);

        }
        System.out.println(toplam);



    }

}
