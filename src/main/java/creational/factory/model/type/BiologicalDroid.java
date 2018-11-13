package creational.factory.model.type;

import creational.factory.model.Description;

/**
 * Created  on 16.07.17.
 */
public class BiologicalDroid implements Description {
    @Override
    public String printDescription() {
        return "It's biological droid";
    }
}
