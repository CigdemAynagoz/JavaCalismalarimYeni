package Interview;

public class Q6_ReserveString {
      /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
      public static void main(String[] args) {
          //1.yol
          String cumle="Java cok kolay";
          StringBuilder str=new StringBuilder();
          str.append(cumle);//String builder e ekleme yapabiliyoruz
          String tersCumle=str.reverse().toString();
          System.out.println("1.yol cozumu : "+tersCumle);

          //2.yol
          System.out.print("2.yol cozumu : ");//sonraki ifadeyi yanına yazdırmak ıcın
          for (int i =cumle.length()-1; i >=0 ; i--) {
              System.out.print(cumle.charAt(i));
          }
          System.out.println();//alt satıra gecsin ustteki ceavbın yanına eklemsın
          //3.yol
          System.out.print("3.yol cozumu : ");
          tersineCevir(cumle);

      }

    private static void tersineCevir(String cumle) {
        char arr[]=cumle.toCharArray();//String bir veriyi karakterlere char tipine cevirir
        for (int i =cumle.length()-1; i >=0 ; i--) {
            System.out.print(arr[i]);
        }
    }
}
