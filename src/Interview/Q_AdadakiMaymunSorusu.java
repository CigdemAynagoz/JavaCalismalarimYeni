package Interview;

public class Q_AdadakiMaymunSorusu {
        /*
There is a lonely monkey in the island
He needs to eat 4 bananas every day
there are just 165 bananas in that island
Create following variables and find how many days
monkey can survive.
Use do while loop, increment and decrement and if statements
int numberOfBananas =165, survivalDays = 1;
boolean monkeyAlive = true;
*/
        public static void main(String[] args) {
            int numberOfBananas =165;
            int survivalDays = 0;
            boolean monkeyAlive = true;

            System.out.println("maymunlar gunde 4 muz yer");
            do {
                numberOfBananas-=4;//toplam muz sayısından her seferinde 4 muz eksilir
                survivalDays++;//yasadıgı gun sayısını bir arttır
                if (numberOfBananas<4){//elimde 4 den az muz kalırsa
                    monkeyAlive=false;//maymun hayatta degil
                    System.out.println("bugun "+survivalDays+" .gun muz kalmadı, maymun sizelere ömür");
                }else System.out.println("bugun "+survivalDays+" .gun maymun hala yasıyor");
            }while(monkeyAlive);
            System.out.println("maymunun toplam yasadıgı gun sayisi : "+ survivalDays);
        }
}
