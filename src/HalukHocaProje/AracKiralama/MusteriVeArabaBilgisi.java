package HalukHocaProje.AracKiralama;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriVeArabaBilgisi extends AracTalep {


    static Scanner scan=new Scanner(System.in);
    static int toplamGun;

    static List<AracTalep> talepEdilenAracListesi = new ArrayList<>();
    public static void girisPaneli() {
        System.out.println("***JAVA RENT a CAR'a HOSGELDİNİZ***");
        System.out.println("Arac kiralamak icin 1'i \nCıkıs yapmak icin 2'yi tuslayiniz ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:aracTalep();break;
            case 2:cıkısArac();break;
            default:
                System.out.println("Yanlis tusladiniz.Tekrar deneyiniz");
        }
    }

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
        arabalar();

    }
    protected  static void getAraba(String marka,String yakitTuru, String vites,int gunlukKira) {
        talepEdilenAracListesi.stream().
                filter(t-> t.getMarka().equalsIgnoreCase(marka) &&
                        t.getYakitTuru().equalsIgnoreCase(yakitTuru)&& t.getVites().equalsIgnoreCase(vites)).
                forEach(System.out::println);

    }
    protected static void islemMenusu() {
        System.out.println("Devam etmek istiyorsanız e, istemiyorsaniz h ye basiniz. Cıkıs yapmak icin Q ya basınız");
        String devam=scan.next();
        switch (devam) {
            case "e": musteriBilgisi();break;
            case "h": arabalar();break;
            case "q": cıkısArac();break;
            default:
                System.out.println("Yanlıs secim yaptınız tekrar deneyiniz");
                islemMenusu();break;

        }
    }

    protected static  void arabalar(){
        AracTalep hondaBOtomatik= new AracTalep("honda","civic"," benzin","otomatik",400);
        AracTalep toyotaDOtomatik= new AracTalep("toyota","yaris"," dizel","otomatik",500);
        AracTalep opelLManuel= new AracTalep("opel","astra"," LPG"," manuel",300);
        AracTalep volvoBOtomatik= new AracTalep("volvo","s40"," benzin","otomatik",700);
        talepEdilenAracListesi.add(hondaBOtomatik);
        talepEdilenAracListesi.add(toyotaDOtomatik);
        talepEdilenAracListesi.add(opelLManuel);
        talepEdilenAracListesi.add(volvoBOtomatik);

        System.out.println(talepEdilenAracListesi);
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
            default:
                System.out.println("Lütfen gecerli bir islem giriniz");

        }
    }

    protected static void musteriBilgisi() {
        System.out.println("Ödeme sayfasına hosgeldiniz.İslemleriniz devam ediyor");
        System.out.println("Lutfen ad-soyad giriniz");
        scan.nextLine();
        String adSoyad=scan.nextLine();

        System.out.println("Telefon numaranızı giriniz");
        String tel=scan.next();
        System.out.println("Lutfen yasınızı giriniz");
        int yas=scan.nextInt();
        if(yas<18||yas>120){
            System.out.println("Uzgunuz, arac kiralayamazsiniz 18 yasından büyük olmaniz gerekir...");
            musteriBilgisi();
        }
        System.out.println("**********************");
        System.out.println("Ad soyad: "+adSoyad+"\nTelefon: "+tel+"\nYas: "+yas);
        odemeBilgileri();
    }

    protected static void odemeBilgileri() {
        System.out.println("Lütfen kart numaranızı giriniz");
        String kartNo = scan.nextLine();
        scan.next();
        int uzunluk=12;

        if (uzunluk>kartNo.length()&&(uzunluk<kartNo.length())){
            System.out.println("Gecersiz kart numarasi");
            odemeBilgileri();
            scan.nextLine();
        }else{
            System.out.println("Odemeniz Basari ile Gerceklesmistir. Iyi gunler dileriz...");

        }
        islemMenusu();
    }


    static void cıkısArac() {
        System.out.println("***Cıkısınız yapılmıstır.***\n***Bizi tercih ettiginiz icin tesekkur ederiz***");

    }

}
