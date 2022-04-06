package SwitchCase;

import java.util.Scanner;

public class S3 {
    //kahve makinasi
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapacaginiz islemi seciniz");
        char islem=scan.next().toUpperCase().charAt(0);
        switch (islem){
            case 'C': System.out.println("Cayiniz hazirlaniyor...");break;
            case 'M': System.out.println("Mesrubatiniz hazirlaniyor...");break;
            case 'K': System.out.println("Kahveniz hazirlaniyor...");break;
            case 'E': System.out.println("Espressonuz hazirlaniyor...");break;
            case 'L': System.out.println("Limonataniz hazirlaniyor...");break;
            default:
                System.out.println("Tekrar deneyiniz");
        }
    }
}
