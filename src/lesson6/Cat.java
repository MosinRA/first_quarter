package lesson6;

public class Cat extends Animals {
    public final int MAXJUMP = 2;
    public final int MAXRUN = 200;


    public Cat(String name, int jump, int swim, int run) {
        super(name, jump, swim, run);
        swim = 0;
        /*//для переопределения высоты прыжка единственное понимаю что костанты в таком случае нужно убрать и сделать просто переменными
        а значение менять в создаваемом объекте. К сожалению не хватило времени реализовать.
        this.changeJump = changeJump;*/
    }

    public boolean checkJump() {
        if (getJump() > MAXJUMP) {
            return false;
        }

        return true;
    }

    public boolean checkRun() {
        if (getRun() > MAXRUN) {
            return false;
        }

        return true;
    }


    @Override
    public void printInfo() {
        if (checkJump() == true) {
            System.out.println(" прыгает на: " + getJump());
        } else {
            System.out.println(" Кот " + getName() + " не может прыгать выше: " + MAXJUMP);
        }
        if (checkRun() == true) {
            System.out.println(" Кот " + getName() + "пробегает : " + getRun());
        } else {
            System.out.println(" Кот " + getName() + " не может пробежать больше: " + MAXRUN);
        }
        if (getSwim() > 0) {
            System.out.println(" Кот " + getName() + " не умеет плавать");
        }
    }
}
