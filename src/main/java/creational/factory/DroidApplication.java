package creational.factory;
import creational.factory.exception.DroidNameException;
import creational.factory.factory.SuperFactory;
import creational.factory.model.Description;

import java.util.Scanner;

/**
 * Created  on 16.07.17.
 * This is man class, which manage factory and factory instances.
 */
public class DroidApplication {

    public static void main(String[] args) throws DroidNameException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Select one of the factories : 'Group' , 'Type' \n");
        SuperFactory factory = FactoryProducer.getFactory(scanner.next());
        System.out.printf("For factory 'Group': you can enter 'Medical', 'Biological'\n" +
                "For factory 'Type' : you can enter 'White', 'Black' \n");
        Description description = FactoryProducer.getInstanceDescription(factory, scanner.next());
        System.out.println(FactoryProducer.print(description));
    }
}
