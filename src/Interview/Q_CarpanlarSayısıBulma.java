package Interview;

import java.util.Scanner;

public class Q_CarpanlarSayısıBulma {
    /*
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
        int sayac=0;
        while (carpan<=sayi){
            if (sayi%carpan==0){
            sayac++;
            System.out.println(carpan+" ");
            }
            carpan++;
        }

        System.out.println(sayi+" sayısının "+sayac+" adet carpani vardir.");
    }
}
