package Set;


public class interview {
    //5 tane ulke ismi ve nufusunu oluşturuyoruz.(put)
    //5 tane ulke ismi ve nufusunu yazdırıyoruz(country)
    //5 tane ulke ismi yazdırıyoruz. (keyset())
    //5 tane ulke nufusunu yazdırıyoruz. (values())
    //nüfusların toplamını yazdırın.
    //kaç tane 50 milyondan fazla nüfuslu ülke var?
    // ulke ve nufus  lari hem map gibi..hem de ayri ayri yazdirma ?

    /*public static void main(String[] args) {
        HashMap<String,Integer> ulke = new HashMap<>();
        ulke.put("Almanya", 80);
        ulke.put("Turkiye", 83);
        ulke.put("Amerika", 250);
        ulke.put("Fransa", 68);
        ulke.put("Kanada ", 40);
        System.out.println("ulke isimleri ve nufuslari :" + ulke + " milyondur");

        System.out.println("ulke isimleri : " + ulke.keySet());
        //ulke isimleri : [Turkiye, Fransa, Almanya, Amerika, Kanada ]
        System.out.println("ulke nufuslari :" + ulke.values());
        //ulke nufuslari :[83, 68, 80, 250, 40]


        System.out.println("nüfusu 50 milyondan fazla olan ülke sayisi :" + ulke.values().stream().filter(t->t>50).count());

        ulke.entrySet().stream().forEach(t-> System.out.println(t.toString()));

        System.out.println("ülkelerin nufuslari toplamı :" + ulke.values().stream().reduce(0,(x,y)->x+y));

    }*/
}
