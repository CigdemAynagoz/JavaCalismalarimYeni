package HalukHocaProje.OkulProjesi;

public class Ogrenci extends Kisi{
    private String  ogrenciNo;
    private String sinif;
    public Ogrenci(){}
    public Ogrenci(String adSoyad, int yas, String kimlikNo, String ogrenciNo, String sinif) {
        super(adSoyad, yas, kimlikNo);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }
    public String getOgrenciNo() {
        return ogrenciNo;
    }
    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
    public String getSinif() {
        return sinif;
    }
    public void setSinif(String sinif) {
        this.sinif = sinif;
    }
    @Override
    public String toString() {
        return "Ogrenci{" +
                "adSoyad='" + adSoyad + '\'' +
                ", yas=" + yas +
                ", kimlikNo='" + kimlikNo + '\'' +
                ", ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif='" + sinif + '\'' ;
    }

}
