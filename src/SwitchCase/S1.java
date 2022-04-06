package SwitchCase;

import java.util.Scanner;

public class S1 {
    //plakalar...
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3,35,45,55,59 plakalarından birini giriniz");
        int plaka=scan.nextInt();
        switch(plaka){
            case 3: System.out.println("Afyonkarahisar");break;
            case 35: System.out.println("İzmir");break;
            case 45: System.out.println("Manisa");break;
            case 55: System.out.println("Samsun");break;
            case 59: System.out.println("Tekirdag");break;
            default:
                System.out.println("tekrar deneyiniz");
        }

    }
}
