package lesson7;

public class Plate {
    private Cat[] cats;
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public Plate() {
        this(0);
    }

    public void addCat(Cat cat) {

    }

    public int getFood() {
        return food;
    }

    public void addFood(int food) {
        this.food += food;
    }

    public void info() {
        System.out.println(this);
    }

    public void decreaseFood(int foodCount) {
        this.food -= foodCount;
    }

    @Override
    public String toString() {
        return "Остаток еды в миске: " + food;
    }
}


