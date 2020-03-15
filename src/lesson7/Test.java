package lesson7;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Мартин", 6);
        Plate plate = new Plate(15);
        Cat[] catArr = new Cat[5];
        {
            catArr[0] = new Cat("Вильям", 10);
            catArr[1] = new Cat("Васька", 3);
            catArr[2] = new Cat("Абрам", 7);
            catArr[3] = new Cat("Илькус", 4);
            catArr[4] = new Cat("Лоусенс", 7);

        }


        plate.info();
        catEat(plate, catArr);
        plate.addFood(20); //Observer
        plate.info();


    }

    //не получилось перебор массива перенести в класс Cat
    private static void catEat(Plate plate, Cat[] catArr) {
        for (int i = 0; i < catArr.length; i++) {
            catArr[i].eat(plate);
            plate.info();

        }
    }
}


