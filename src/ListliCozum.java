import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListliCozum {
    /*
Write a Java program to get a String from user as input and find
the maximum occurring character in that string. (Ignore case sensitivity)
input :Learning java is easy
output:maximum occurring character is : a

Kullanıcıdan girdi olarak bir Dize almak için bir Java programı yazın
ve bu dizede oluşan maksimum karakteri bulun. (Büyük/küçük harf duyarlılığını yoksay)
girdisi :Java öğrenmek kolaydır çıktısı: maksimum karakter : a
*/
    public static void main(String[] args) {
        String input = "Java ogrenmek guzeldir";
        String arr[] = input.split("");//input u arr ye cevirdim
        //List<String> str=new ArrayList<>(Arrays.asList(arr));//arr yi liste cevirdim
       // System.out.println(str);
        String enCokTekrarEden="";
        List<String> enCokTekrarEdenKarakter=new ArrayList<>();//bos bir en cok tekrar eden listi olusturdum
        int maxTekrar=0;
        int tekrar=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j])){
                    tekrar++;
                }
            }
            if (tekrar > maxTekrar ) {
                maxTekrar= tekrar;
                enCokTekrarEden+=arr[i];
                enCokTekrarEdenKarakter.add(arr[i]);
            }else if ( tekrar==maxTekrar)

            tekrar = 0;
            }

        System.out.println(enCokTekrarEdenKarakter);
        }
    }
