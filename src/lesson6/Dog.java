package lesson6;

public class Dog extends Animals {
    public final float MAXJUMP = 0.5f;
    public final int MAXRUN = 500;
    public final int MAXSWIM = 10;

    private int jumpHeight;

    public Dog(String name, int jump, int swim, int run) {
        super(name, jump, swim, run);
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

    public boolean checkSwim() {
        if (getSwim() > MAXSWIM) {
            return false;
        }

        return true;
    }


    @Override
    public void printInfo() {
        if (checkJump() == true) {
            System.out.println(" Пес " + getName() + " прыгает на: " + getJump());
        } else {
            System.out.println(" Пес " + getName() + " не может прыгать выше: " + MAXJUMP);
        }
        if (checkRun() == true) {
            System.out.println(" Пес " + getName() + " пробегает : " + getRun());
        } else {
            System.out.println(" Пес " + getName() + " не может пробежать больше: " + MAXRUN);
        }
        if (checkSwim() == true) {
            System.out.println(" Пес " + getName() + " проплывает : " + getSwim());
        } else {
            System.out.println(" Пес " + getName() + " не может проплыть больше: " + MAXSWIM);
        }
    }
}



