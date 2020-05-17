package Day;

public class Main {
    public static void main(String[] args) {
        DayOfWeek time = DayOfWeek.FRIDAY;

        for (DayOfWeek d: DayOfWeek.values() ) {
            if (d.getTime()!=0)
            System.out.println(d + " до конца рабочей недели - " + d.getTime() + " часа(ов)");
            else {
                System.out.println(d + " - Сегодня выходной");
            }
        }

    }
}
