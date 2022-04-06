package SwitchCase;

import java.util.Scanner;

public class Javabank {
    public static void main(String[] args) {
        System.out.println("****JAVABAKNK'a HOSGELDİNİZ****");
        System.out.println("1. bakiye sorgulama");
        System.out.println("2.para yatırma");
        System.out.println("3.para cekme");
        System.out.println("4.kart iade");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapacagınız islemi seciniz");
        int islemNo=scan.nextInt();
        int bakiye=1000;
        switch (islemNo){
            case 1: System.out.println("bakiyeniz : "+bakiye);break;
            case 2:
                System.out.println("Ne kadar yatıracaksınız");
                int yatırılacakMiktar=scan.nextInt();
                System.out.println("bakiyeniz: "+(bakiye+yatırılacakMiktar));break;
            case 3:
                System.out.println("Ne kadar cekecekınız");
                int cekilecekTutar=scan.nextInt();
                if(bakiye<cekilecekTutar){
                    System.out.println("bakiyeniz yetersiz");
                }else {
                    System.out.println("bakiyeniz: "+(bakiye-cekilecekTutar));
                }break;
            case 4:
                System.out.println("Cıkınız yapıldi");break;
            default:
                System.out.println("yapacagınız islemi tekrar tanımlayınız");

        }

    }
}
