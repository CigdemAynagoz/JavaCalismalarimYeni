package HalukHocaProje.OkulProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    static List<Ogrenci> ogrenciListesi = new ArrayList<>();
    static List<Ogretmen> ogretmenListesi = new ArrayList<>();
    public static void girisPaneli() {
        System.out.println("HOSGELDİNİZ OGRENCI VE OGRETMEN YONETIM PANELI ");
        System.out.println("1- ogrenci işlemleri \n 2-Ogretmen işlemleri \n Q-Cıkış ");
        System.out.println("işleminizi seciniz: ");
        String islem = scan.next().toUpperCase();
        switch (islem) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatali giris yaptiniz");
                girisPaneli();
                break;
        }
    }
    private static void cıkıs() {
        System.out.println("İşleminiz sona ermiştir.");
    }
    private static void islemMenusu() {
        System.out.println(kisiTuru + " icin işlem seciniz: \n 1-Ekleme \n 2-Arama \n 3-Listeleme \n 4-Silme \n 0-Ana Menu");
        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("hatali secim yaptiniz");
                islemMenusu();
                break;
        }
    }
    private static void listele() {
        for (int i = 0; i < ogrenciListesi.size(); i++) {
            System.out.println(ogrenciListesi.get(i));
        }
    }
    private static void arama() {
        System.out.println("1- ogrenci icin \n 2-ogretmen icin");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("ogrenci tc giriniz");
                String tcKimlikNo = scan.next();
                boolean varMi = false;
                for (int i = 0; i < ogrenciListesi.size(); i++) {
                    if (ogrenciListesi.get(i).getKimlikNo().equals(tcKimlikNo)) {
                        varMi = true;
                        System.out.println(ogrenciListesi.get(i));
                    }
                }
                if (!varMi) {
                    System.out.println("boyle bir ogrenci bulunamadi");
                } break;
            case 2:
                System.out.println("ogretmen tc giriniz ");
                String tcKimlikN = scan.next();
                boolean varM = false;
                for (int i = 0; i < ogretmenListesi.size(); i++) {
                    if (ogretmenListesi.get(i).getKimlikNo().equals(tcKimlikN)) {
                        varM = true;
                        System.out.println(ogretmenListesi.get(i));
                    }
                }
                if (!varM) {
                    System.out.println("boyle bir ogrenci bulunamadi");
                } break;
        }
    }
    private static void silme() {
        System.out.println("1- ogrenci icin \n 2-ogretmen icin");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println("ogrenci numarasi giriniz");
                String numara= scan.next();
                boolean varMi = false;
                for (int i = 0; i < ogrenciListesi.size(); i++) {
                    if (ogrenciListesi.get(i).getOgrenciNo().equals(numara)) {
                        varMi = true;
                        System.out.println(ogrenciListesi.remove(ogrenciListesi.get(i)));
                    }
                }
                if (!varMi) {
                    System.out.println("boyle bir ogrenci bulunamadi");
                }
                listele();
                break;
            case 2:
                System.out.println("ogretmen sicil no giriniz ");
                String sicilNo = scan.next();
                boolean varM = false;
                for (int i = 0; i < ogretmenListesi.size(); i++) {
                    if (ogretmenListesi.get(i).getSicilNo().equals(sicilNo)) {
                        varM = true;
                        System.out.println(ogretmenListesi.remove(ogretmenListesi.get(i)));
                    }
                }
                if (!varM) {
                    System.out.println("boyle bir ogrenci bulunamadi");
                }   listele();
                break;
        }
    }
    private static void ekle () {
        System.out.println(kisiTuru + " ekleme menusune hosgeldiniz ");
        System.out.println("ad soyad giriniz : ");
        scan.nextLine();
        String adSoyad = scan.nextLine();
        System.out.println("kimlik no giriniz: ");
        String kimlikNo = scan.nextLine();
        System.out.println("yaşınızı giriniz : ");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENCI")) {
            System.out.println("ogrenci no giriniz : ");
            String ogrenciNo = scan.next();
            System.out.println("sinif giriniz: ");
            String sınıf = scan.next();
            Ogrenci ogrenci = new Ogrenci(adSoyad, yas, kimlikNo, ogrenciNo, sınıf);
            ogrenciListesi.add(ogrenci);
        } else if (kisiTuru.equals("OGRETMEN")) {
            System.out.println("sicil No giriniz: ");
            String sicilNo = scan.next();
            scan.nextLine();
            System.out.println("bolum giriniz: ");
            String bolum = scan.nextLine();
            Ogretmen ogretmen = new Ogretmen(adSoyad, yas, kimlikNo, bolum, sicilNo);
            ogretmenListesi.add(ogretmen);
        }
        System.out.println("ekleme işleminiz basariyla gerceklesmistir");
    }
}
