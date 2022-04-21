package HalukHocaProje.AracKiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriVeArabaBilgisi extends AracTalep {


    static Scanner scan=new Scanner(System.in);
    static int toplamGun;

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
       toplamGun=(tAyi-aAyi)*30+(tGunu-aGunu);
        System.out.println("odenecek gun sayisi "+toplamGun);

    }
    public static void islemMenusu() {
        System.out.println("Devam etmek istiyorsanız e, istemiyorsaniz h ye basiniz. Cıkıs yapmak icin Q ya basınız");
        String devam=scan.next();
        if (devam=="e"){
            musteriBilgisi();
        }else if (devam=="h"){
         arabalar();
        }else if (devam=="q"){
            cıkısArac();
        }
    }

    static void musteriBilgisi() {
        System.out.println("Ödeme sayfasına hosgeldiniz.İslemleriniz devam ediyor");
        System.out.println("Lutfen ad-soyad giriniz");
        String adSoyad=scan.nextLine();
        scan.nextLine();
        System.out.println("Telefon numaranızı giriniz");
        String tel=scan.next();

        System.out.println("Lutfen yasınızı giriniz");
        int yas=scan.nextInt();
        odemeBilgileri();
    }

    static void odemeBilgileri(){
        System.out.println("Lütfwn kart numaraınızı giriniz");
        String kartNo=scan.nextLine();
        scan.nextLine();
        String kartNoSu="123456789";
        if((kartNoSu==kartNo)){
            System.out.println("gecerli kart no");
        }else {

            System.out.println("gecersiz kart numarası");
            odemeBilgileri();
            scan.next();
        }
        System.out.println("odemeniz barasılıyla gerceklesmistir");
    }


    private static void cıkısArac() {
        System.out.println("***Cıkısınız yapılmıstır.***\n***Bizi tercih ettiginiz icin tesekkur ederiz***");

    }


    public static  void arabalar(){
        AracTalep hondaBOtomatik= new AracTalep("honda"," benzin","otomatik",400);
        AracTalep toyotaDOtomatik= new AracTalep("toyota"," dizel","otomatik",500);
        AracTalep opelLManuel= new AracTalep("opel"," LPG"," manuel",300);
        AracTalep volvoBOtomatik= new AracTalep("volvo"," benzin","otomatik",700);
        talepEdilenArac.add(hondaBOtomatik);
        talepEdilenArac.add(toyotaDOtomatik);
        talepEdilenArac.add(opelLManuel);
        talepEdilenArac.add(volvoBOtomatik);

        System.out.println(talepEdilenArac);
        System.out.println("Talep ettidiginiz arabanın numarasını giriniz.\n1:hondaBOtomatik \n2:toyotaDOtomatik \n3:opelLManuel \n4:volvoBOtomatik");
        int tercih=scan.nextInt();
        switch(tercih){
            case 1:
               getAraba("honda","benzin","otomatik",400);
               int ucretH=toplamGun*400;
                System.out.println("odeyeceginiz miktar: "+ucretH);
                islemMenusu();
                break;
            case 2:
                getAraba("toyota","dizel","otomatik",500);
                int ucretT=toplamGun*500;
                System.out.println("odeyeceginiz miktar: "+ucretT);
                islemMenusu();
                break;
            case 3:
                getAraba("opel","lpg","manuel",300);
                int ucretO=toplamGun*300;
                System.out.println("odeyeceginiz miktar: "+ucretO);
                islemMenusu();
                break;
            case 4:
                getAraba("volvo","benzin","otomatik",700);
                int ucretV=toplamGun*700;
                System.out.println("odeyeceginiz miktar: "+ucretV);
                islemMenusu();
                break;

        }
    }

    public  static void getAraba(String marka,String yakitTuru, String vites,int gunlukKira) {
        talepEdilenArac.stream().
                filter(t-> t.getMarka().equalsIgnoreCase(marka) &&
                        t.getYakitTuru().equalsIgnoreCase(yakitTuru)&& t.getVites().equalsIgnoreCase(vites)).
                forEach(System.out::println);

    }

    public static void kiralamaBedeli(){


    }
}
