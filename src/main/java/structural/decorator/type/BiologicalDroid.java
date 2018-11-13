package structural.decorator.type;


import structural.decorator.Describable;

/**
 * Created  on 16.07.17.
 */
public class BiologicalDroid implements Describable {
    @Override
    public String printDescription() {
        return "It's biological droid";
    }
}
