package creational.factory.factory;

import creational.factory.exception.DroidNameException;
import creational.factory.model.Description;

/**
 * Created  on 16.07.17.
 */
public interface SuperFactory {
    Description getType(String type) throws DroidNameException;

    Description getGroup(String group) throws DroidNameException;
}
