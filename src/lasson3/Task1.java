package lasson3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        game();
    }

    static void game() {
        System.out.println("Угадайте число от 0 до 9 ");
        Scanner scanner = new Scanner(System.in);
        int a = (int) (Math.random() * 9);
        int game;
        int answer = scanner.nextInt();
        int score = 0;
        while (score != 3) {
            if (answer == a) {
                System.out.println("Вы ответили правильно!");
                System.out.println("Желаете сыграть еще раз? 1 - да, 0 - нет");
                game = scanner.nextInt();
                if (game == 1) {
                    score = 0;
                    a = (int) (Math.random() * 9);
                    System.out.println("Угадайте число от 0 до 9 ");
                    answer = scanner.nextInt();
                } else System.exit(0);
            }
            if (answer > a) {
                System.out.println("Введенное число больше загаданного. Повторите попытку");
                answer = scanner.nextInt();
                score++;
            }
            if (answer < a) {
                System.out.println("Введенное число меньше загаданного. Повторите попытку");
                answer = scanner.nextInt();
                score++;
            }
        }
        System.out.println("Попытки закончились! хотите повторить? 1 - да, 0 - нет\"");

        game = scanner.nextInt();
        if (game == 1) {
            game();
        }
    }
}
