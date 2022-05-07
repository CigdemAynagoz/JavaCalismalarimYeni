package YeniHastane;


import static YeniHastane.hastaneIslemler.hastaneMenusu;

public class HastaneRunner {


    public static void main(String[] args) throws InterruptedException {

        DoktorIslemler.doktorListesi();
        HastaIslemler.hastaListesi();
        hastaneMenusu();




    }


}