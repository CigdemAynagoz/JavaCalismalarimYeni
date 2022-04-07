package ForWhileDoWhile;

public class S2 {
     /* SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
            * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
            * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
            */


    public static void main(String[] args) {
        int sayi1 = 30;
        int sayi2 = 40;

        int ebob = 1;
        int ekok = 1;

        for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {

                // ebob= i+ ebob;
                ebob = i;

            }

        }
        ekok = (sayi1 * sayi2) / ebob;
        System.out.println(ebob);

    }
}
