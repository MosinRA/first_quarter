package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int counter = 0;
        int[] task2 = new int[8];
        for (int i = 0; i < task2.length; i++) {
            task2[i] = counter;
            counter = counter + 3;
            System.out.println(task2[i]);


        }
    }
}
