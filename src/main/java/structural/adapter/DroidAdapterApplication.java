package structural.adapter;

import structural.adapter.model.Droid;
import structural.adapter.model.Move;
import structural.adapter.model.WheelDroid;
import structural.adapter.model.WingsDroid;

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
