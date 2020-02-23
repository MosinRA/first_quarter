package lesson2;

// подглядывал в интернете
public class Task4 {
    public static void main(String[] args) {
        int[][] task4 = new int[3][3];
        for (int i = 0; i <= task4.length - 1; i++) {
            for (int j = 0, j2 = task4[i].length; j < task4[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) task4[i][j] = 1;
            }
        }
        printArr(task4);
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, j2 = arr[i].length; j < arr[i].length; j++, j2--) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
