package HalukHocaProje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        List<User> list = new ArrayList<User>();

        User user1 = new User();
        System.out.println(user1);
        System.out.println("Adınız gırınız");
        user1.setUsername(scan.next());

        String password = "";
        boolean sifre = true;

        while (sifre) {
            System.out.println("sıfre gırınz");
            password = scan.next();
            if (password.length() < 6) {
                System.out.println("hatalı gırız ! 6 veya daha fazla karakter gırınz");
            } else {
                sifre = true;
                break;
            }

        }


        user1.setPassword(password);

        list.add(user1);
        System.out.println(list.get(0));
        System.out.println("***");

        User user2 = new User();
        System.out.println(user2);
        System.out.println("2.Adınız gırınız");
        user2.setUsername(scan.next());

        String pwd = "";
        boolean bl = true;

        while (bl) {
            System.out.println("sıfre gırınz");
            pwd = scan.next();
            if (pwd.length() < 6) {
                System.out.println("hatalı gırız ! 6 veya daha fazla karakter gırınz");
            } else {
                bl = false;
                break;
            }
        }

        user2.setPassword(pwd);
        list.add(user2);
        System.out.println(list.get(1));
    }
}
