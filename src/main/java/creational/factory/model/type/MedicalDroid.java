package creational.factory.model.type;

import creational.factory.model.Description;

/**
 * Created  on 16.07.17.
 */
public class MedicalDroid implements Description {

    @Override
    public String printDescription() {
        return "It's medical droid";
    }
}
