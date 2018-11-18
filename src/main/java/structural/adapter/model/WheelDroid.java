package structural.adapter.model;

/**
 * Created  on 20.07.17.
 */
public class WheelDroid implements Move {
    @Override
    public void move() {
        System.out.println("Droid drive on wheels");
    }
}
