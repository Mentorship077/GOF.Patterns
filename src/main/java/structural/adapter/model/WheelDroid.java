package structural.adapter.model;

/**
 * Created  on 20.07.17.
 */
public class WheelDroid implements Move {

    private String message;

    public WheelDroid(String message) {
        this.message = message;
    }

    @Override
    public void move() {
        System.out.println(this.message);
    }
}
