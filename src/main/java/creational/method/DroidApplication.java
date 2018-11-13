package creational.method;


import creational.method.exception.DroidNameException;
import creational.method.model.Description;

import java.util.Scanner;

/**
 * Created  on 20.07.17.
 * This is main class, factory instances.
 */
public class DroidApplication {

    public static void main(String[] args) throws DroidNameException {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("For factory 'Group': you can enter 'Medical', 'Biological'\n");
        Description type = new TypeFactory().getType(scanner.next());
        System.out.println(type.printDescription());

    }
}
