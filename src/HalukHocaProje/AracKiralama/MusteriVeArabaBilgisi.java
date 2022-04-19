package HalukHocaProje.AracKiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriVeArabaBilgisi extends AracTalep {


    static Scanner scan=new Scanner(System.in);

    static List<AracTalep> talepEdilenArac= new ArrayList<>();

    public static  void aracTalep() {
        System.out.println(" lutfen teslim alacaginiz gunu giriniz ");
        String alinacakGun = scan.next().toUpperCase();
        System.out.println("lutfen aracin alinacagi sehri yaziniz ");
        String alinacakSehir = scan.next().toUpperCase();
        System.out.println(" lutfen teslim gununu giriniz ");
        String teslimGunu = scan.next().toUpperCase();
        System.out.println(" lutfen alacaginiz saati giriniz ");
        double alisSaati = scan.nextDouble();
        System.out.println(" lutfen teslim saatini giriniz ");
        double teslimSaati = scan.nextDouble();

        String aGun=alinacakGun.substring(0,2);  // gun  sayisi almak icin
        int aGunu=Integer.parseInt(aGun);  // String ifadeyi int cevirdik
        String aAy=alinacakGun.substring(3);  // ay sayisini almak icin
        int aAyi=Integer.parseInt(aAy);    //  String ifadeyi int cevirdik

        System.out.println(" alis tarihi : "+ aGunu+"."+ aAyi);

        String tGun=teslimGunu.substring(0,2);
        int tGunu=Integer.parseInt(tGun);
        String tAy=alinacakGun.substring(3);
        int tAyi=Integer.parseInt(tAy);

        System.out.println(" teslim tarihi "+ tGunu+"."+ tAyi);

        if(aAyi > tAyi){
            System.out.println(" alis tarihi teslim tarihinden fazla olmaz ");
            aracTalep();

        }else if(aGunu > tGunu){
            System.out.println(" alis gunu teslim gununden sonra olmaz ");
            aracTalep();

        }else{

        }


    }


    public void arabalar(){
        AracTalep arb1= new AracTalep("honda"," benzin","otomatik",400);
        AracTalep arb2= new AracTalep("toyota"," dizel","otomatik",500);
        AracTalep arb3= new AracTalep("opel"," LPG"," manuel",300);
        AracTalep arb4= new AracTalep("volvo"," benzin","otomatik",700);
        talepEdilenArac.add(arb1);
        talepEdilenArac.add(arb2);
        talepEdilenArac.add(arb3);
        talepEdilenArac.add(arb4);



    }
}
