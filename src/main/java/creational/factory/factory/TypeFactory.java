package creational.factory.factory;

import creational.factory.enums.DroidType;
import creational.factory.exception.DroidNameException;
import creational.factory.model.Description;
import creational.factory.model.type.BiologicalDroid;
import creational.factory.model.type.MedicalDroid;

/**
 * Created  on 16.07.17.
 */
public class TypeFactory implements SuperFactory {
    @Override
    public Description getType(String droidTypeString) throws DroidNameException {
        Description droidsTypeInstance;
        if (droidTypeString.equalsIgnoreCase(DroidType.Medical.name())) {
            droidsTypeInstance = new MedicalDroid();
        } else if (droidTypeString.equalsIgnoreCase(DroidType.Biological.name())) {
            droidsTypeInstance = new BiologicalDroid();
        } else {
            throw new DroidNameException("Please enter correct group");
        }
        return droidsTypeInstance;
    }

    @Override
    public Description getGroup(String group) throws DroidNameException {
        return null;
    }
}
