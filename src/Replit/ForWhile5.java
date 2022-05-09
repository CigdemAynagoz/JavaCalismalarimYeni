package Replit;

public class ForWhile5 {
    /*Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0

    100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.

OUTPUT : 100 98 96 94 92 … … … … 2 0
*/
    public static void main(String[] args) {

        for (int i = 100; i >=0 ; i-=1) {
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
