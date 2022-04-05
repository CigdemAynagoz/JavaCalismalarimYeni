package Replit;

import java.util.Scanner;

public class ornek {
    static void harfBul(String cumle, char harf) {
        int sayac = 0;
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == harf) {
                sayac++;
            }
        }
        System.out.println("Girdiginiz cumle veya kelımede " + sayac + " tane '" + harf + "' vardır");
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Bir cumle veya kelime giriniz: ");
        String cumle = scan.nextLine();
        System.out.print("Bir harf giriniz: ");
        char harf = scan.next().charAt(0);

        harfBul(cumle, harf);
    }
}