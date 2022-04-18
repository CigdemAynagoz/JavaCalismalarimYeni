package Interview;

import java.util.Scanner;

public class Q_AtbashCode {
    /*
  AtbashCode ; bir metni şifrelemek veya şifresini çözmek için İbrani alfabesine temelli basit bir yöntemdir.
  Alfabenin ilk harfi son harfi yerine kullanilmaktadir..
  "abcdefghijklmnopqrstuvwxyz"; 26 harf
  "zyxwvutsrqponmlkjihgfedcba";
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("sifrelencek ifadeyi giriniz");
        String ifade=scan.nextLine().toLowerCase();
        for (int i = 0; i <ifade.length() ; i++) {
            int index='z'-ifade.charAt(i);//tersten bakacagı ıcın sondan cıkardık,kayma mıktarını hesap ediyoruz
            System.out.print((char)(('a')+index));
        }
        System.out.println();
        //2.yontem
        String str1=  "abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
        System.out.println("sifrelencek ifadeyi giriniz");
        String str3=scan.nextLine().toLowerCase();

        for (int i = 0; i <str3.length() ; i++) {
            for (int j = 0; j <26 ; j++) {//str1 ve str2 icin indexler
                if (str3.charAt(i)==str1.charAt(j)){
                    //kullancıdan aldıgımız str3 deki herhangi bir karakter str1 deki kraktere esitse
                    System.out.print(str2.charAt(j));//aynı ındexdeki str2 ye esitse
                }
            }
        }

    }
}
