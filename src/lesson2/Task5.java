package lesson2;

public class Task5 {
    public static void main(String[] args) {

        int[] task5 = {1, 4, 5, 6, 10, 8, 6, 5, 4, 3, 2, 1};
        int max = task5[0];
        int min = task5[0];

        for (int i = 0; i < task5.length; i++) {
            if (task5[i] > max) {
                max = task5[i];
            }
            if (task5[i] < min) {
                min = task5[i];
            }
        }
        System.out.println("Максимальный элемент со значением  = " + max);
        System.out.println("Минимальный элемент со значением  = " + min);
    }
}
