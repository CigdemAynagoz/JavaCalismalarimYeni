package HalukHocaProje.SansliKullaniciSorusu;

import java.time.LocalDateTime;

public class Kullanıcı {
    String name;
    LocalDateTime kayıtZamanı;

    public Kullanıcı(String isim, LocalDateTime now) {
    }

    public void Kullanıcı() {//p'siz cons...
    }

    public void Kullanıcı(String name, LocalDateTime kayıtZamanı) {//p'li cons...
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }
}
