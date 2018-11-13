package adapter;

import adapter.model.Move;
import adapter.model.WingsDroid;

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
