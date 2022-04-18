package Interview;

public class Q_FrekansSayisi {
    /*
  Interview sorusu...
  Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.

  Test data:
  Input = AAABBCDD
  output = A3B2C1D2
          */
    public static void main(String[] args) {
        String str ="AAABBCDD";
        frekans(str);
    }

    private static void frekans(String str) {
        String output="";
        for (int i = 0; i <str.length() ; i++) {//kıyas edilen

            int sayac = 0;
            for (int j = i; j <str.length(); j++) {//kıyas eden harf
                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {
                    sayac++;
                }
            }if (!output.contains(str.substring(i,i+1))){//kıyas edilen outputta yoksa
                    output+=str.substring(i,i+1)+sayac;
                }
                else sayac=0;//tekrar etmeyen harf icin yazdık ve  sayaci sıfırladık
            }
        System.out.println("output: "+output);

    }
    }
