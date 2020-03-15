package lesson7;

public class Cat {
    private String name;
    private int appetite;
    public boolean satiety = false;
    int endAppetite = appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite) {
            satiety = true;
            doEat(plate);
            System.out.println("Кот по имени " + getName() + " съел: " + appetite + " сытость: " + satiety);
            return;


        } else if (appetite > plate.getFood()) {
            for (int i = 0; i <= 0; i++) {
                int appetiteEnd = plate.getFood() - i;
                appetiteEnd += i;
                endAppetite = appetite - appetiteEnd;
                plate.decreaseFood(appetiteEnd);
                System.out.println("Кот по имени " + getName() + " съел " + appetiteEnd + " и остался недоволен!");
                System.out.println("Чтобы наесться нужно еще: " + endAppetite + " из: " + appetite + " еды " + " сытость: " + satiety);
            }

        }

    }

    /*public void printAppetite() {
        System.out.println("у кота по имени " + getName() + " сытость после еды " + getAppetite());
    }*/

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);


    }
}


