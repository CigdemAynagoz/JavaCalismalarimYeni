package Interview;

import java.util.Scanner;

public class Q_CarpanlarSayısıBulma {
    /*
      Type java code by using while loop,
      Write a program to count the factors of an integer which is entered by user.
      Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
      Factors of 8  = 1, 2, 4, 8 ==> 4

    Java kodunu while döngüsünü kullanarak yazın, Kullanıcı tarafından girilen bir tamsayının
    çarpanlarını sayan bir program yazın.
    12'nin çarpanları = 1, 2, 3, 4, 6, 12 ==> 6
     8'in çarpanları = 1, 2, 4, 8 ==> 4
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int sayi=Math.abs(scan.nextInt());
        int carpan=1;
        int sayac = 0;
        while (carpan<=sayi){
            if (sayi%carpan==0){
                sayac++;
                System.out.print(carpan+" ");
            }
            carpan++;
        }
        System.out.println("");
        System.out.println(sayi+" sayisinin "+ sayac+" adet carpani vardir");
    }

}
