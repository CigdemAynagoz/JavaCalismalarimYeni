package Interview;

import Lambda.Lambda01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciLambda {
    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("pozitif bir tam sayi giriniz");
        int input=scan.nextInt();
      List<Integer> fibonacciSayilar = new ArrayList<>();
      fibonacciSayilar.add(0);
      fibonacciSayilar.add(1);
          int i=1;
        if(input<=0){
            System.out.println("Lütfen daha buyuk bir sayi giriniz");
        }else {
          while(fibonacciSayilar.get(i)<input){
              fibonacciSayilar.add(fibonacciSayilar.get(i)+fibonacciSayilar.get(i-1));
              i++;
          }
        System.out.println(fibonacciSayilar);
         if (fibonacciSayilar.get(fibonacciSayilar.size()-1)>input){
              fibonacciSayilar.remove(fibonacciSayilar.size()-1);
              System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmamaktadir ." +
                      "\n Girilen sayiya kadar fibonacci dizisi : " + fibonacciSayilar);

          }else {
              System.out.println("Girilen sayi fibonacci dizisinde bulunmaktadir \n"+ fibonacciSayilar);
          }
        System.out.println("***Lambda ile yazdirma***");
printElFunctionalFibonacci(fibonacciSayilar);
      }}


    public static void printElFunctionalFibonacci(List<Integer> fibonacciSayilar) {
        fibonacciSayilar.stream().forEach(Lambda01::yazdir);
    }
}
