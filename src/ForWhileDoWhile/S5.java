package ForWhileDoWhile;

public class S5 {
    public static void main(String[] args) {
        //kullanicidan iki tamsayi alip
        //bu sayiilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturun
        int baslangic = 40;
        int bitis = 60;

        int i = baslangic;
        while (i <= bitis) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        System.out.println(baslangic);
    }
}