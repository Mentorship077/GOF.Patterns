package structural.decorator.type;

import structural.decorator.Describable;

/**
 * Created  on 16.07.17.
 */
public class MedicalDroid implements Describable {

    @Override
    public String printDescription() {
        return "It's medical droid";
    }
}
