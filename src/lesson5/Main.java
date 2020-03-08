package lesson5;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("Игнатьев Вячеслав Валерьевич", "Директор", "Тест@ta.re", 634118, 120000, 55);
        person[1] = new Person("Дворников Игорь Олегович", "Дворник", "Тест@ta.re", 0, 15000, 45);
        person[2] = new Person("Язвин Валентин Романович", "Специалист по кадрам", "Тест@ta.re", 777555, 100000, 35);
        person[3] = new Person("Деревянко Павел Данилович", "Начальник отдела продаж", "Тест@ta.re", 3434343, 110000, 40);
        person[4] = new Person("Равшанов Равшан Равшанович", "Мастер", null, 343537, 90000, 28);

        for (int i = 0; i < person.length; i++) {
                if (person[i].age > 40){
                System.out.println("Список сотрудников старше 40 лет: " + person[i]);
             //   person[i].printInfo();
            }

        }


    }
}
