import java.util.Scanner;

public class Main {
    final static double usd = 96.42;
    final static double eur = 104.86;
    final static double cny = 13.46;
    final static double byn = 29.35;
    final static double jpy = 0.64;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму денег в рублях");
        double number = scanner.nextDouble();
        double conv_money;
        System.out.println("В какую валюту вы хотите конвертировать сумму?\n" +
                "1 - Доллар США\n"+
                "2 - Евро\n" +
                "3 - Китайский Юань\n" +
                "4 - Белорусский рубль\n" +
                "5 - Японская йена");
        System.out.println("Нажмите 0, чтобы выйти");
        int n;
        while (true){
            n = scanner.nextInt();
            switch (n) {
                case 1 -> {
                    conv_money = number / usd;
                    System.out.println(conv_money);
                }
                case 2 -> {
                    conv_money = number / eur;
                    System.out.println(conv_money);
                }
                case 3 -> {
                    conv_money = number / cny;
                    System.out.println(conv_money);
                }
                case 4 -> {
                    conv_money = number / byn;
                    System.out.println(conv_money);
                }
                case 5 -> {
                    conv_money = number / jpy;
                    System.out.println(conv_money);
                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Введено неверное значение");
            }
        }
    }
}