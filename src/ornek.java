import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kart numaranızı giriniz");
        String kartNo = scan.nextLine();
       // scan.next();
        int uzunluk=12;
        if (uzunluk>kartNo.length()||(uzunluk<kartNo.length())){
            System.out.println("yanlıs girdiniz");
            //odemeBilgileri();
           // scan.nextLine();
        }else{
            System.out.println("Odemeniz Basari ile Gerceklesmistir. Iyi gunler dileriz...");

        }    System.out.println("Gecersiz kart numarasi");


    }



}
