package Interview;

import java.util.ArrayList;

public class Q2 {
    // int array list oluşturun 10 elemandan oluşmalı
// random ekle isinde void bir metod oluşturun  ve parametresi int array list olsun.
// bu metod array list içinde 0' dan 20 ye kadar değer atasın.
// eğer çift sayı atarsa o elemaının yerine 111 yazsın
// eğer çift sayı yoksa çift sayı yoktur mesajını versin.
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        randomEkle(list);

    }

    private static void randomEkle(ArrayList<Integer> list) {
        for (int i = 0; i <10 ; i++) {
            list.add((int) (Math.random()*20));//0-20 arası random sayi ekler
                                               //double vei tipine sahip olan math random classı hata verdiginden
                                               //integer a casting yaptik.random() 0-1 arası sayi uretir
        }
        System.out.println("random liste "+list);
        int sayac = 0;
        for (int i = 0; i < list.size() ; i++) {
            if (list.get(i)%2==0){//cift sayı varsa
                sayac++;
                list.set(i,111);
            }
        }
        System.out.println("111ler eklendikten sonra random liste : "+list);
        if (sayac==0){
            System.out.println("Listede cift sayi yoktur");
        }
        System.out.println("Listenin son hali : "+list);
    }
}
