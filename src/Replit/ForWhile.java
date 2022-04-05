package Replit;

import java.util.Scanner;

public class ForWhile {
    /*Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=65432*1=720
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        int faktoryel=1;
        for (int i = sayi; i >0; i--) {
            faktoryel=faktoryel*i;
        }
        System.out.println(sayi+"!= "+faktoryel);
    }
}
