package Set;


import java.util.HashSet;

public class Q1 {
    /* TASK:
parametresi Integer set ve integer array ve adi elementEkle
olan array elemanalrı set'e convert edn bir method create ediniz .
yine set icindekileri yazdiracak ayrica bir metod daha create edip print ediniz.
 */
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        elementEkle(hs, arr);
        System.out.println();
        elementEkle(hs,new int[]{35,45,55,65,75});

    }

    private static void elementEkle(HashSet<Integer> hs, int[] arr) {
       // HashSet<Integer> hs2=new HashSet<>();
        for (Integer sayi:arr) {
            hs.add(sayi);
        }
        yazdir(hs);
    }
    public static void yazdir(HashSet<Integer> hs){
        for (Integer s:hs) {
            System.out.print(s+" ");
        }
    }

}
