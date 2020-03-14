package lesson6;

public class Animals {
    private String name;
    private int jump;
    private int swim;
    private int run;

    public Animals(String name, int jump, int swim, int run) {
        this.name = name;
        this.jump = jump;
        this.swim = swim;
        this.run = run;
    }

    public int getJump() {
        return jump;
    }

    public String getName() {
        return name;
    }

    public int getSwim() {
        return swim;
    }

    public int getRun() {
        return run;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.printf("Животное: %s, может пробежать: %s, может проплыть: %s может подпрыгнуть на: %s",
                getName(),
                getRun(),
                getSwim(),
                getJump());

    }
}
