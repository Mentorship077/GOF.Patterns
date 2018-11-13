package creational.factory.model.group;

import creational.factory.model.Description;

/**
 * Created  on 16.07.17.
 */
public class White implements Description {
    @Override
    public String printDescription() {
        return "This droid born white";
    }
}
