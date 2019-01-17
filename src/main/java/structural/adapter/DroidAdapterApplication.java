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
        Move wheelDroid = new WheelDroid("Droid drive on wheels");
        droid.start(wheelDroid);

        WingsDroid wingsDroid = new WingsDroid("I can fly");
        Move adapter = new DroidAdapter(wingsDroid);
        droid.start(adapter);
    }
}
