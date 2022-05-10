package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class YinelenenKarakter {
    public static void main(String[] args) {
        /*
    Write a code that returns the duplicate chars in a String array.(interview Question)
    Bir String dizisinde yinelenen karakterleri döndüren bir kod yazın.(mülakat Sorusu)
Input :
String str=“Javaisalsoeasy”
Output: [a, s]
     */
        String str="Javaisalsoeasy";
        String arr[]=str.split("");
        System.out.println(Arrays.toString(arr));

        List<String> list = Arrays.asList(arr);

        List <String> birdenFazla= new ArrayList<>(); //
        Collections.sort(list);

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i-1].equals(arr[i])){
                birdenFazla.add(arr[i]);
            }
        }
        System.out.println("Birden fazla olan element List"+birdenFazla);
        List<String> istenen = new ArrayList<>();

        System.out.println("\n***");
        birdenFazla.stream().distinct().forEach(t->System.out.print(t+" "));
        System.out.println("\n***");


        for (int i = 0; i <birdenFazla.size() ; i++) {
            if (!istenen.contains(birdenFazla.get(i))){
                istenen.add(birdenFazla.get(i));
            }
        }
        System.out.println("Sonuc: "+istenen);

    }
}
