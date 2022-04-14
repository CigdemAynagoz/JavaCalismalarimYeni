package HalukHocaProje.OkulProjesi;

public class Kisi {
    protected String adSoyad;
    protected int yas;
    protected String kimlikNo;
    public Kisi(){}
    public Kisi(String adSoyad, int yas, String kimlikNo) {
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.kimlikNo = kimlikNo;
    }
    public String getAdSoyad() {
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }
    public String getKimlikNo() {
        return kimlikNo;
    }
    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }
    @Override
    public String toString() {
        return "Kisi{" +
                "adSoyad='" + adSoyad + '\'' +
                ", yas=" + yas +
                ", kimlikNo='" + kimlikNo + '\'' +
                '}';
    }
}
