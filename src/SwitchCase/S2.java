package SwitchCase;

import java.util.Scanner;

public class S2 {
    //bankamtik...
    public static void main(String[] args) {
        System.out.println("****JAVABAKNK'a HOSGELDİNİZ****");
        System.out.println("1:Bakiye goruntuleme ");
        System.out.println("2:Para Cekme ");
        System.out.println("3:Para yatirma ");
        System.out.println("4:Kart İade ");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yapacaginiz islemi seciniz..");
        int islemNo= scan.nextInt();
         int bakiye=1000;
         switch(islemNo){
             case 1: System.out.println("Bakiyeniz : "+bakiye);break;
             case 2: System.out.println("Ne kadar cekeceksiniz.. ");
             int cekilecekTutar=scan.nextInt();
             if(cekilecekTutar>bakiye){
                 System.out.println("Bakiyeniz yetersiz...");
             }else {
                 System.out.println("Bakiyeniz : "+(bakiye-cekilecekTutar));
             }
             break;
             case 3: System.out.println("Ne kadar yatirilacaksiniz : ");
             int yatirilacakMiktar=scan.nextInt();
                 System.out.println("Bakiyeniz : "+(bakiye+yatirilacakMiktar));
             break;
             case 4: System.out.println("Cikisiniz yapildi...");break;
             default:
                 System.out.println("Hatali giris yaptiniz.\nLütfen yapacaginiz islemi tekrar giriniz");
         }

    }
}
