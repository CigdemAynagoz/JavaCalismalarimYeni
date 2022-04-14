package ArrayList;

public class Ozet {
    /*

    *ArrayList length’i esnek olan bir Array’dir

    *Uzunlugunu degistirmek istedigimizde veya bir element eklemek istedgimizde
    Array de yeni bir Array olusturmak gerekirken List de gerekmez

    *ArrayList<String> list1 = new ArrayList<String>();

    *ArrayList<String> list2 = new ArrayList<>();

    *List<String> list3 = new ArrayList<>(); En cok bu kullanilir

    *ArrayList<String> list4 = new List<>();Compile Time Error verir, esitligin sag tarafinda ArrayList kullanmak zorundayiz

    *List i direkt soutun icinde yazdırabiliriz

                       ***ARRAYLİST METHODLARI***
    1) add() : eleman eklemek icin kullanırız."" ile index olmadan (1,Ayse) gibi index ile de yapılabilir
                                            eklenen elemanı indexsiz tek tek olursa arkasına ekler. index li eklersek kaykıl yaptırır:)
                                            listimiz.add seklinde kullanılır
    2) size() : Listin length i degil size' i olur.ArrayList in kac elemani oldugunu soyler

    3) isEmpty() : method’u ArrayList bos ise true, bos degilse false dondurur

    4) remove() : ArrayList’den belli bir elemani silmek icin kullanilir.

                *Index’li remove(index) dedigimizde ArrayList’de verilen index’deki elemani siler

                *remove(index) methodunu sout icinde kullanirsak silinen elemani ekrana yazdirir. sout(List.remove(index)) ..

                *remove(“eleman”) index’i degil elemani kullanirsak kullandigimiz elemanin ilk kullanildigi yeri bulur ve siler.

                *Index’siz remove() method’u true veya false dondurur.
                System.out.println(List.remove(“liste olan eleman x ”)); //true yani x eleman olarak vardi ve sildim
                System.out.println(hayvan.remove(“liste olmayan eleman y ”)); // false yani y eleman olarak yoktu dolayisiyla silemedim

   5) set() : methodu ArrayList’de var olan bir elemani degistirmeye yarar

            *set() method’u add() method’u yerine kullanilamaz .Olmayan bir index ile set() kullanilirsa exception verir.
            Orn:size'i 1 olan bir list de list.set(2,"Ayse") dersek  IndexOutOfBoundsException verir

   6) get() : ArrayList’deki istenen indexdeki elemani dondurur.

   7) contains() : ArrayList’de bir elemanin var olup olmadigini kontrol eder. Eleman varsa true, yoksa false return eder.

   8) Collections.sort() : sort() methodu ArrayList’deki elemanlari kucukten buyuge veya alfabetik siraya gore dizer.

   9) equals() : iki listteki ayni indexteki elemanlarin ayni olup olmadigini kontrol eder.
                Ayni indexteki tum elemanlar ayni ise true return eder, farkli ise false return eder
   10) clear() : ArrayList’teki tum elemanlari siler. Return type’i void’dir, hic bir sey donmez

                        ***ARRAY'i LİST'e CEVİRME***
   * List<String> list = Arrays.asList(arr); seklinde kullanılır
    Uzunlugu degistirilemeyen bir list’e cevirir.
    Yani;yeni olusturulan listte add(), remove() ve clear() methodlarini kullanamazsiniz. Exception

   *NOT: Eger array’deki bir elemani degistirirseniz list’teki eleman da otomatik olarak degisir.
         Listteki bir elemani degistirirseniz array de otomatik olarak degisir.

                       ***ARRAYLİST'i ARRAY'e CEVİRME***

    1.yontem : String arr[ ] = list.toArray(new String[0]);

    2.yontem : Object arr[ ] = list.toArray( );

 */
}
