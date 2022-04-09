package HalukHocaProje.SansliKullaniciSorusu;

import java.time.LocalDateTime;

public class Kullanici {
    String name;
    LocalDateTime kayitZamani;

    public Kullanici(){//parametresiz conts.

    }

    public Kullanici(String name, LocalDateTime kayitZamani) {
        this.name = name;
        this.kayitZamani = kayitZamani;
    }
}
