package structural.decorator;

import structural.decorator.superType.SeniorMedicalDroid;
import structural.decorator.type.BiologicalDroid;

/**
 * Created  on 19.07.17.
 */
public class DroidDecoratorApplication {
    public static void main(String[] args) {
        Describable biologic = new BiologicalDroid();
        Describable superBiological = new SeniorMedicalDroid(new BiologicalDroid());
        System.out.printf("Simple droid description : %s " +
                        " Super droid with additional functionality : %s",
                biologic.printDescription(), superBiological.printDescription());
    }
}
