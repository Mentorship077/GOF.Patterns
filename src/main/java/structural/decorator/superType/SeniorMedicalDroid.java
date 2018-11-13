package structural.decorator.superType;

import structural.decorator.Describable;
import structural.decorator.DescribableDecorator;

/**
 * Created  on 19.07.17.
 */
public class SeniorMedicalDroid extends DescribableDecorator {
    public SeniorMedicalDroid(Describable describable) {
        super(describable);
    }

    @Override
    public String printDescription() {
        return super.printDescription() + " " + setLevel();
    }

    private String setLevel() {
        return "It's  senior Medical droid";
    }
}
