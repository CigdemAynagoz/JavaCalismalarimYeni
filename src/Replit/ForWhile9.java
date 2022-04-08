package Replit;

public class ForWhile9 {
        /*Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

Input :1238

Output :Girilen Numananin Tersi: 8321
*/
        public static void main(String[] args) {
         int input=1238;
         while(input>0){
                 System.out.print(input % 10);
                 input /= 10;
         }
        }
}
