package HalukHocaProje.SansliKullaniciSorusu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit {
  List<Kullanici> kisiler=new ArrayList<>();//bos list create edildi.kyıtal metodu bu lıste elemean atayacak

    public List<Kullanici> kayıtAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Adinizi giriniz: ");
        String isim=scan.nextLine();
        Kullanici k1=new Kullanici(isim, LocalDateTime.now());//kullanici lasstan p.li conts.ile obj create edildi

        return kisiler;
    }
}
