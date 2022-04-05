package Replit;

import java.util.Scanner;

public class ifswtrnry8 {
    /*Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String isim=scan.nextLine().toLowerCase();
        if(isim.length()>2){
            System.out.println(isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2));
        }else {
            System.out.println("Daha uzun bir isim giriniz");
        }
    }
}
