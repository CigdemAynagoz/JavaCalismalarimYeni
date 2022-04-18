package Interview;

import java.util.Scanner;

public class Q_UsluSayı {
    //Get 2 numbers from the user.
//first number base
//second number Top
//Write a code that calculates the prime of a number.
// 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen taban ve üs giriniz");
        int taban=scan.nextInt();
        int us=scan.nextInt();
        int sonuç=1;
        while(us!=0){
            sonuç*=taban;
            us--;
        }
        System.out.println("while ile sonuc : "+sonuç);

        //2.yontem
        for (int i = 0; i <us ; i++) {
            sonuç*=taban;
        }
        System.out.println("for ile sonuc : "+sonuç);
    }

}
