package creational.method;


import creational.method.enums.DroidType;
import creational.method.exception.DroidNameException;
import creational.method.model.BiologicalDroid;
import creational.method.model.Description;
import creational.method.model.MedicalDroid;

/**
 * Created  on 16.07.17.
 */
public class TypeFactory {
    public Description getType(String droidTypeString) throws DroidNameException {
        Description instance;
        if (droidTypeString.equalsIgnoreCase(DroidType.Medical.name())) {
            instance = new MedicalDroid();
        } else if (droidTypeString.equalsIgnoreCase(DroidType.Biological.name())) {
            instance = new BiologicalDroid();
        } else throw new DroidNameException("Please enter correct group");
        return instance;
    }
}
