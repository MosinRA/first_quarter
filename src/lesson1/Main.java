package lesson1;

public class Main<exp> {


    public static void main(String[] args) {

        //задание 2
        byte bt = 2;
        short sh = 153;
        int inIn = 98756;
        long lo = 12365497946L;
        float flo = 1.356f;
        double doub = 1.22;
        char chr = 'M';
        char chrN = 12354;
        boolean bool = true;
        System.out.println("байт: " + bt + "\nШорт: " + sh + "\nИтеджер: " + inIn + "\nЛонг: " + lo + "\nФлоат: " + flo + "\nДабл: " + doub + "\nЧар: " + chr + "\nЧар через цифры: " + chrN + "\nбулеан: " + bool);

        //задание 3


        int a = 2;
        int b = 4;
        int c = 2;
        int d = 3;
        int exp = a * (b + (c / d));
        System.out.println("Задание 3 " + exp);

        //задание 4

        a = 8;
        b = 3;
        int с = a + b;
        if (a >= 10 && a <= 20) {
            System.out.println("Задание 4 " + true);
        } else System.out.println(false);

        // задание 5
        a = 0;
        if (a >= 0) {
            System.out.println("Задание 5 введено положительное число");
        } else System.out.println("Задание 5 Введено отрицательное число");


        // задание 6

        a = -2;
        if (a < 0) {
            System.out.println("Задание 6 " + true);
        } else System.out.println("Задание 6" + false);

        //задание 7
        String name = "Мосин Роман";
        System.out.println("Привет, " + name + " !!!");

        //задание 8


        int year =  2020;
        if(year % 100 != 0 && year % 4 == 0 || year % 400 == 0){
            System.out.println("Год високосный");
        }else System.out.println("Год не високосный");
    }
}

