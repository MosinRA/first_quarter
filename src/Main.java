public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human("Игорь"),
                new Cat("Злюк"),
                new Robot("Киборг"),
                new Human("Том Круз", 5000, 2)
        };

        Obstacle[] obstacles = {
                new Cross(5000),
                new Whall(3)
        };

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) {
                    break;
                }
            }
        }

        for (Competitor c : competitors) {
            c.info();
        }
    }
}
