import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static final String[] wordlist = {"дом", "лес", "террарий", "функция", "доставка",
            "опухоль", "абстракция", "монах"};
    static boolean is_won = false;
    static int lives = 6;
    public static void main(String[] args) {
        int rnd = new Random().nextInt(wordlist.length);
        Scanner scanner = new Scanner(System.in);
        String guessed = wordlist[rnd];
        StringBuilder syphered = new StringBuilder();
        syphered.append("_".repeat(guessed.length()));
        System.out.println(syphered);

        while (lives != 0 && !is_won){
            System.out.println("Введите букву");
            String letter = scanner.next();
            if (guessed.contains(letter)){
                for (int i = 0; i<syphered.length(); i++)
                    if (Objects.equals(letter, guessed.substring(i, i+1)))
                        syphered.replace(i, i+1, letter);
                System.out.println(syphered);
                if (syphered.indexOf("_") == -1) {
                    System.out.println("Попыток осталось: " + lives + "\n" + syphered);
                    is_won = true;
                    System.out.println("Вы победили");
                }
            }
            else {
                lives --;
                System.out.println("Попыток осталось: " + lives + "\n" + syphered);
                if (lives == 0){
                    System.out.println("Вы проиграли");
                }
            }
        }
        System.out.println("Игра окончена");
    }
}