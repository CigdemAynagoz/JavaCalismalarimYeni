package HalukHocaProje.OkulProjesi;

public class Ogretmen extends Kisi {
    private String bolum;
    private String sicilNo;
    public Ogretmen () {}
    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
    public Ogretmen(String adSoyad, int yas, String kimlikNo, String bolum, String sicilNo) {
        super(adSoyad, yas, kimlikNo);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }
    public String getBolum() {
        return bolum;
    }
    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    public String getSicilNo() {
        return sicilNo;
    }
    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
    @Override
    public String toString() {
        return "Ogretmen{" +
                "adSoyad='" + adSoyad + '\'' +
                ", yas=" + yas +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                '}';
    }
}
