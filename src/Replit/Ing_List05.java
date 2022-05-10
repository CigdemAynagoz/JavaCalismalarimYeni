package Replit;

import java.util.ArrayList;
import java.util.Scanner;

public class Ing_List05 {
    /*Write a program that accepts an integer as input and prints first 10 prime numbers
    greater than input Check numbers if they are even or not in a return method.
Input : 5
Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]

Girdi olarak bir tamsayı kabul eden ve girdiden büyük ilk 10 asal sayıyı ekrana yazdıran
 bir program yazınız.
 Giriş : 5
 Çıkış : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir taamsayi giriniz");
        int sayi=scan.nextInt();
        int sayac = 0;
        ArrayList<Integer> asalSayiLİst=new ArrayList<>();
        for (int i = sayi; i < Integer.MAX_VALUE; i++) {
            boolean asal = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = false;
                }
            }
            if (asal == true) {
                if (i == 5) {
                    continue;
                } else {
                    asalSayiLİst.add(i);
                    sayac++;
                }
            }
            if (sayac == 10) {
                break;
            }
        }
        System.out.println(asalSayiLİst);

    }
}
