import java.security.SecureRandom;
import java.util.Scanner;

public class Main {
    static String symbols =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@$%^&*";
    static SecureRandom rnd = new SecureRandom();


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько символов должно быть в пароле? (8-12)");
        int n = scanner.nextInt();
        if (n == 8) System.out.println(randomPass(symbols, 8));
        else if (n == 9)  System.out.println(randomPass(symbols, 9));
        else if (n == 10)  System.out.println(randomPass(symbols, 10));
        else if (n == 11)  System.out.println(randomPass(symbols, 11));
        else if (n == 12)  System.out.println(randomPass(symbols, 12));
    }

    public static String randomPass(String symbols, int len){

        StringBuilder pass = new StringBuilder(len);

        for (int i = 0; i < len; i++) {
            pass.append(symbols.charAt(rnd.nextInt(symbols.length())));
        }

        return pass.toString();
    }
}