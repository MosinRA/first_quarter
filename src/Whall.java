public class Whall extends Obstacle {
    private int height;

    public Whall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}


