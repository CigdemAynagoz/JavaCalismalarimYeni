package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorular {
    /*
    1) Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.

    2) indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
       index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
       ArrayList’i ekrana yazdiriniz, list boyle olmali; A, L, C, E, F, B.

    3) set() methodu kullanarak, E’yi D yapiniz.
       ArrayList’i ekrana yazdiriniz, list boyle olmali; A, L, C, D, F, B.

    4) remove() methodu kullanarak, F’yi siliniz.
       ArrayList’i ekrana yazdiriniz, list boyle olmali; A, L, C, D, B.

    5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
       ArrayList’i ekrana yazdiriniz, list boyle olmali; A, B, C, D, L.

    6) contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var olmadigini dogrulayiniz.

    7) size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.

    8) clear() methodu kullanarak, list’deki tum elemanlari siliniz.

    9) isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz
*/
    public static void main(String[] args) {
        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");

        System.out.println(harfler);//[A, C, E, F]

        harfler.add("B");
        System.out.println(harfler);//[A, C, E, F, B]

        harfler.add(1,"L");
        System.out.println(harfler);//[A, L, C, E, F, B]

        harfler.set(3,"D");
        System.out.println(harfler);//[A, L, C, D, F, B]

        harfler.remove(4);
        //harfler.remove("F");
        System.out.println(harfler);//[A, L, C, D, B]

        Collections.sort(harfler);
        System.out.println(harfler);//[A, B, C, D, L]

        System.out.println(harfler.contains("L"));//true
        System.out.println(harfler.contains("M"));//false

        System.out.println(harfler.size());//5

        harfler.clear();
        System.out.println(harfler);//[]

        System.out.println(harfler.isEmpty());//true
    }
}
