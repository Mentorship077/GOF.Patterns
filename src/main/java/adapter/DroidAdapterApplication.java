package adapter;

import adapter.model.Droid;
import adapter.model.Move;
import adapter.model.WheelDroid;
import adapter.model.WingsDroid;

/**
 * Created  on 20.07.17.
 */
public class DroidAdapterApplication {
    public static void main(String[] args) {
        Droid droid = new Droid();
        Move wheelDroid = new WheelDroid();
        droid.start(wheelDroid);

        WingsDroid wingsDroid = new WingsDroid();
        Move adapter = new DroidAdapter(wingsDroid);
        droid.start(adapter);
    }
}
