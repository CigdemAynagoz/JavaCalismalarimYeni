package Interview;

import java.util.Scanner;

public class Q9_IndexiTekOlanKarakter {
    // indexi tek sayi olan karakterleri yazdiran bir code create ediniz
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str=scan.nextLine();
        int index=0;
        do {
            if (index%2==1){
                System.out.print(str.charAt(index)+" ");
            }
            index++;
        }while(index<str.length());
        /*String str="Java ogrenmek cok guzel";
        for (int i = 0; i <str.length() ; i++) {
            int index='z'-str.charAt(i);

            if (index%2==1){
                System.out.println("indexi tek olan karakterler : "+(char)('a'+i));
            }
        }*/
    }
}
