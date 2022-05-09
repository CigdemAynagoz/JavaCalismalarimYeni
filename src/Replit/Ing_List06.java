package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ing_List06 {
   /* Write a program to find the common elements between two String Arrays (without case sensitivity)
    Input1 : {John,Brad,Ange,Sofia,Emily}
    Input2 : {sofia,brad,grace,emily,hazel}
    Output : [sofia,brad,emily]

    İki String Dizisi arasındaki ortak elemanları bulan bir program yazın (büyük/küçük harf duyarlılığı olmadan)
     Input1 : {John,Brad,Ange,Sofia,Emily}
     Input2 : {sofia,brad,grace,emily,hazel}
     Çıktı : [sofia,brad, emily]
     */
   public static void main(String[] args) {
       String[] input = new String[]{"John", "Brad", "Ange", "Sofia", "Emily" };
       String[] str = new String[]{"sofia", "brad", "grace", "emily", "hazel" };

       ArrayList<String> input1=new ArrayList<>(Arrays.asList(input));
       ArrayList<String> input2=new ArrayList<>(Arrays.asList(str));
       ArrayList<String> ortakElemanList=new ArrayList<>();
       System.out.println(input1);
       System.out.println(input2);
       for (int i = 0; i <input1.size() ; i++) {
           for (int j = 0; j <input2.size() ; j++) {
               if (input1.get(i).equalsIgnoreCase(input2.get(j))){
                   ortakElemanList.add(input1.get(i));
               }
           }
       }
       System.out.println(ortakElemanList);
   }
}
