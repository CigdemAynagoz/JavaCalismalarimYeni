package ArraysSorular;

import java.util.Arrays;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kac elementli bir array istiyorsunuz");
        int girilenSayi = scan.nextInt();
        int arr[] = new int[girilenSayi];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ".ci elementi giriniz");
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("En buyuk element ve ne kucuk element farki= " + (arr[girilenSayi - 1] - arr[0])); /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 v e girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren java code create ediniz.*/
    }
}