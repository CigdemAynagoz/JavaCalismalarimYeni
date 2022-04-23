package Maps;

import java.util.HashMap;

public class Q1 {
    //  Ad ve soyad bulunduruan iki ayrı array'i ad=soyad  seklinde yazdırınız.
// input : {"ahmet", "ahmet can", "haluk"};  {"şeref", "erdem", "bilgin"};
// output : {ahmet=şeref, ahmet can=erdem, haluk=bilgin};
    public static void main(String[] args) {
        String ad[]= {"ahmet", "ahmet can", "haluk"};
        String soyAd[]= {"şeref", "erdem", "bilgin"};
        HashMap<String,String> adSoyad=new HashMap<String,String>();
        for (int i = 0; i <ad.length ; i++) {
            adSoyad.put(ad[i],soyAd[i]);
        }
        System.out.println(" ad soyad : "+adSoyad);
    }
}
