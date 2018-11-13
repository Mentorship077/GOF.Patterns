package structural.decorator.superType;

import structural.decorator.Describable;
import structural.decorator.DescribableDecorator;

/**
 * Created  on 19.07.17.
 */
public class JuniorBiologicalDroid extends DescribableDecorator {
    public JuniorBiologicalDroid(Describable describable) {
        super(describable);
    }

    @Override
    public String printDescription() {
        return super.printDescription() + "  " + setLevel();
    }

    private String setLevel() {
        return "It's junior Biological Droid";
    }
}
