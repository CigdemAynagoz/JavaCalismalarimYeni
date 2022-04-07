package StringBuilder;

import java.util.List;

public class Q1 {
    //Haluk Hoca
        public static void main(String[] args) {
    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)
         Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri yazdiran code create ediniz.
       input : Learning java is easy
       output: maximumCounts occurring character is : a
        */
            String input = "Learninyg Javya iys yeasyaa";
            List<String> inputList = List.of(input.split(""));
            System.out.println(inputList);
            encokKullanilanKarakterBul(inputList);
        }
        public static void encokKullanilanKarakterBul(List<String> inputList) {
            int encok = 0;
            int sayac = 0;
            String karakter = "";
            for (int i = 0; i < inputList.size(); i++) {
                sayac = 0;
                for (int j = 0; j < inputList.size(); j++) {
                    if (inputList.get(i).equalsIgnoreCase(inputList.get(j))) {
                        sayac++;
                    }
                }
                if (sayac > encok) {
                    encok = sayac;
                    karakter = inputList.get(i);
                }
            }
            System.out.println(sayac);
            System.out.println(karakter);
        }
}
