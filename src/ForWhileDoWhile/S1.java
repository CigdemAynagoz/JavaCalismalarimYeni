package ForWhileDoWhile;

public class S1 {
    static int sayilar;
    //    Write a Java program to print the odd numbers from 1 to 99. Prints one number per line. Go to the editor
//    Sample Output:
//
//    1
//    3
//    5
//    7
//    9
//    11
//    ....
//    91
//    93
//    95
//    97
//    99
    //1'den 99'a kadar olan tek sayıları yazdıran bir Java programı yazın. Her satıra bir sayı yazdırır.
    public static void main(String[] args) {
        teksayi(sayilar);

    }

    private static void teksayi(int sayilar) {

        for (int i = 1; i < 100; i++) {
            if(i % 2==1){
                System.out.println(i);
            }
        }
    }
}

