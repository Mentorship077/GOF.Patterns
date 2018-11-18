package structural.adapter;

import structural.adapter.model.Move;
import structural.adapter.model.WingsDroid;

/**
 * Created  on 20.07.17.
 */
public class DroidAdapter implements Move {
    private WingsDroid wingsDroid;

    public DroidAdapter(WingsDroid wingsDroid) {
        this.wingsDroid = wingsDroid;
    }

    @Override
    public void move() {
        wingsDroid.move();
    }
}
