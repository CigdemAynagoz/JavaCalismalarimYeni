package Replit;

public class forwhile6 {
    /* Konsolda Alfabeyi Yazdıran programi yaziniz.
    OUTPUT :
    a b c .. .. .. .. y z
    */
    public static void main(String[] args) {
        //String karakter="abcdefghjklmnoprstuvyz";
        char karakter = 0;
        for (karakter = 'a'; karakter <= 'z'; karakter++) {
            System.out.print(karakter + " ");
        }
    }
}
