package Replit;

import java.util.Scanner;

public class ForWhile7 {
    /*Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse, herhangi bir sayı Mükemmel Sayı olarak bilinir.
Input : 6
Output: 6 Mukemmel Sayidir.
======================
Input  7
Output: 7 Mukemmel Sayidir degildir.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi=scan.nextInt();
        int toplam=0;
        for (int i = 1; i <sayi ; i++) {
            if (sayi%i==0){
                toplam+=i;
        }

        }
        if (sayi==toplam){
            System.out.println(sayi+" Mukemmel sayidir");
        }else {
            System.out.println(sayi+" Mukemmel sayi degildir");
        }
    }
}
