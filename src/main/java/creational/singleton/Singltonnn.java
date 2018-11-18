package creational.singleton;

public class Singltonnn {
    private static Singltonnn instance;

    private Singltonnn() {
    }

    public static Singltonnn getInstance() {
        if (instance == null) {
            instance = new Singltonnn();
        }
        return instance;
    }
}
