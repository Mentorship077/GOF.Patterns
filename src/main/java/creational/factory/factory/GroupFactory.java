package creational.factory.factory;

import creational.factory.enums.GroupType;
import creational.factory.exception.DroidNameException;
import creational.factory.model.Description;
import creational.factory.model.group.Black;
import creational.factory.model.group.White;

/**
 * Created  on 16.07.17.
 */
public class GroupFactory implements SuperFactory {

    @Override
    public Description getType(String type) throws DroidNameException {
        return null;
    }

    @Override
    public Description getGroup(String group) throws DroidNameException {
        Description droidsGroupInstance;
        if (group.equalsIgnoreCase(GroupType.White.name())) {
            droidsGroupInstance = new White();
        } else if (group.equalsIgnoreCase(GroupType.Black.name())) {
            droidsGroupInstance = new Black();
        } else {
            throw new DroidNameException("Please enter correct group");
        }
        return droidsGroupInstance;
    }
}