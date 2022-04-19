package Set;

import java.util.ArrayList;

public class Q2 {
    /*  Method:
           10 ve 5 elemanli, elemanlari 0-20 arasinda değer alan 2 adet  ArrayList create edin ve
        elemanlarini aldigi min, max degerleri arasindaki random sayi ile doldurup
        sonucta bir ArrayList return eden bir method yaziniz
        main:
        1.  Yazdiginiz Methodu kullanarak bir 10 ve 5 elemanli
            elemanlari 0-20 arasinda 2 adet ArrayList olusturun
        2.  Bu iki list'in ortak elemanlarini bulunuz
        3.  Bu iki list'in farkli olan elemanlarini bulunuz
        4.  Bu listleri birbirine ekleyip önce kücükten büyüge sonra ters siralayiniz

     */
    public static void main(String[] args) {

    ArrayList<Integer> arrList1 = new ArrayList<>();
    ArrayList<Integer> arrList2 = new ArrayList<>();
    arrList1= arrListHazirla(10,0,20);
    arrList2= arrListHazirla(5,0,20);
        System.out.println("10 elementli list: "+arrList1);
        System.out.println("5 elementli list: "+arrList2);

        // arrList1.retainAll(arrList2);
        // System.out.println("ortak elemanli list : "+arrList1);
        arrList1.removeAll(arrList2);//list1 den list2 cıkarılan 1 de olup 2 de olmayan farklı elemnların old lıst yazıldı
        System.out.println(arrList1);
        arrList2.removeAll(arrList1);
        System.out.println(arrList2);
}
    public static int getRandomInt(int min,int max){//bu method max ile min sati uretip return eder
        return (int) (Math.random()*(max-min+1));
    }
    private static ArrayList<Integer> arrListHazirla(int size, int min, int max) {
    ArrayList<Integer> bosList=new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            bosList.add(getRandomInt(min,max));
        }
    return bosList;
    }

}
