package creational.factory;

import creational.factory.enums.Factory;
import creational.factory.exception.DroidNameException;
import creational.factory.factory.GroupFactory;
import creational.factory.factory.SuperFactory;
import creational.factory.factory.TypeFactory;
import creational.factory.model.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created  on 17.07.17.
 */
public class FactoryProducer {
    private final static Logger LOG = LoggerFactory.getLogger(FactoryProducer.class);

    /**
     * This is "abstract_factory method" which manage all factory.
     */
     static SuperFactory getFactory(String factory) throws DroidNameException {
        SuperFactory superFactory;
        if (factory.equals(Factory.Group.name())) {
            superFactory = new GroupFactory();
        } else if (factory.equals(Factory.Type.name())) {
            superFactory = new TypeFactory();
        } else {
            throw new DroidNameException("Please enter valid factory");
        }
        LOG.info("Retrieve a factory : " + superFactory.getClass());
        return superFactory;
    }

    /**
     * This is "creational.abstract method" which manage instance of factory.
     */
     static Description getInstanceDescription(SuperFactory factory, String instance) throws DroidNameException {
        Description description;
        if (factory instanceof TypeFactory) {
            description = factory.getType(instance);
        } else if (factory instanceof GroupFactory) {
            description = factory.getGroup(instance);
        } else {
            throw new DroidNameException("Please enter valid factory instance");
        }
        LOG.info("Retrieve a factory instance [ " + instance + " ]");
        return description;
    }

     static String print(Description description) throws DroidNameException {
        LOG.info("Return string of instance  " + description.printDescription());
        return description.printDescription();
    }
}

