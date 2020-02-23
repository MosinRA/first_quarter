package lesson2;

public class Task3 {
    public static void main(String[] args) {
        int[] task3 = {1, 4, 5, 6, 10, 8, 6, 5, 4, 3, 2, 1};
        for (int i = 0; i < task3.length; i++){
            task3[i] = task3[i] < 6 ? task3[i] * 2 : task3[i];
            System.out.println(task3[i]);
        }

    }
}
