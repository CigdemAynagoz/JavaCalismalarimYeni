package Interview;

import Lambda.Lambda01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSorusu {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("pozitif bir tamsayi giriniz");
         int input=scan.nextInt();

         List<Integer> fibonacciSayiList = new ArrayList<>();
         fibonacciSayiList.add(0);
         fibonacciSayiList.add(1);
         int i=1;
         while(fibonacciSayiList.get(i)<input){
             fibonacciSayiList.add(fibonacciSayiList.get(i)+ fibonacciSayiList.get(i-1));
             i++;

         }
        // System.out.println(fibonacciSayiList);
         if(fibonacciSayiList.get(fibonacciSayiList.size()-1)>input){
             fibonacciSayiList.remove(fibonacciSayiList.size()-1);
             System.out.print("girilen sayi dizide yoktur \n"+fibonacciSayiList);
         }else{
             System.out.print("girilen sayi dizide vardir \n"+ fibonacciSayiList);
         }

         System.out.println("\n***lambda ile***");
         printElFunctionalFibonacci(fibonacciSayiList);
     }
    public static void printElFunctionalFibonacci(List<Integer> fibonacciSayiList){
         fibonacciSayiList.stream().forEach(Lambda01::yazdir);
    }

    }
