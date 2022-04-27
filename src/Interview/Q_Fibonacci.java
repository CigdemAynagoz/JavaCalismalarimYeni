package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_Fibonacci {
/*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Pozitif bir tam sayi giriniz");
    int input=scan.nextInt();

    List<Integer> fibonacciSayilar = new ArrayList<>();
    fibonacciSayilar.add(0);
    fibonacciSayilar.add(1);

    int i=1;
    if(input<=0){
        System.out.println("Lütfen daha buyuk bir sayi giriniz");
    }else {
        while(fibonacciSayilar.get(i)< input){ //fibonacci elemanlari, sayidan kucuk oldugu surece,
            fibonacciSayilar.add(fibonacciSayilar.get(i) + fibonacciSayilar.get(i-1)); //bir onceki eleman ile topla
            i++;
        }
        if(fibonacciSayilar.get(fibonacciSayilar.size()-1)>input) { //fibonaccideki son eleman, sayidan buyukse
            fibonacciSayilar.remove(fibonacciSayilar.size()-1); //bu elemani kaldir
            System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmamaktadir ." +
                    "\n Girilen sayiya kadar fibonacci dizisi : " + fibonacciSayilar);
        }else
            System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmaktadir..:" + fibonacciSayilar);

    }
}
}
