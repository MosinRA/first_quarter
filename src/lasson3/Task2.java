package lasson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        String[][] words = {
                {"apple", "яблоко"},
                {"orange", "апельсин"},
                {"lemon", "лемон"},
                {"banana", "банан"},
                {"apricot", "абрикос"},
                {"avocado", "авакадо"},
                {"broccoli", "броколи"},
                {"carrot", "морковка"},
                {"cherry", "вишня"},
                {"garlic", "чеснок"},
                {"grape", "грейпфрут"},
                {"melon", "дыня"},
                {"leak", "утечка"},
                {"kiwi", "киви"},
                {"mango", "манго"},
                {"mushroom", "гриб"},
                {"nut", "орех"},
                {"olive", "оливки"},
                {"pea", "персик"},
                {"peanut", "арахис"},
                {"pear", "груша"},
                {"pepper", "перец"},
                {"pineapple", "ананас"},
                {"pumpkin", "тыква"},
                {"potato", "картошка"}

        };
        Scanner scanner = new Scanner(System.in);
        int question = (int) (Math.random() * words.length);
        String str = words[question][1];

        while (true) {
            System.out.println("Попробуйте перевести слово: " + words[question][0]);
            String userUnswer = scanner.next().toLowerCase();
            if (userUnswer.equals(words[question][1])) {
                System.out.println("Верный ответ!");
                question = (int) (Math.random() * words.length);
                str = words[question][1];
            } else
                System.out.println("Ответ не верный!" + str.charAt(0) + str.charAt(1) + "#########");
        }


    }

}

