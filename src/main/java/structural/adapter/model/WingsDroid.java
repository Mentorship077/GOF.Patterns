package structural.adapter.model;

/**
 * Created  on 20.07.17.
 */
public class WingsDroid {
    private String message;

    public WingsDroid(String message) {
        this.message = message;
    }

    public void move() {
        System.out.println(this.message);
    }
}
