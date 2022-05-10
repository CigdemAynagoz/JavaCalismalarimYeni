package Replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ing_Array03 {
    /*Bir String'i parametre olarak kabul eden ve verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.
    girdi: ade1r4d3
    çıktı: 8*/
    public static void main(String[] args) {
String str="ade1r4d3";

        String arr[]= str.replaceAll("\\D","").split("");
        System.out.println(Arrays.toString(arr));
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=Integer.valueOf(arr[i]);
        }
        System.out.println(toplam);
       /* for(int i=0; i<arr.length; i++){
            if (Character.isDigit(arr[i].charAt(0))){
                toplam+=Integer.valueOf(arr[i]);
            }
        }
        System.out.println("string ifadenin sayi degerleri toplami : "+toplam);*/



    }
}
