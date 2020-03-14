package lesson6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", 3, 22, 22);
        cat.printInfo();
        Dog dog = new Dog("Догги", 2, 5, 500);
        dog.printInfo();
        /*//для переопределения высоты прыжка единственное понимаю что костанты в таком случае нужно убрать и сделать просто переменными
        а значение менять в создаваемом объекте. К сожалению не хватило времени реализовать.
        dog1.changeJump = ...*/
    }

}
