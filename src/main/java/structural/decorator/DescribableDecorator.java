package structural.decorator;

/**
 * Created  on 19.07.17.
 */
public class DescribableDecorator implements Describable {
    protected Describable describable;

    public DescribableDecorator(Describable describable) {
        this.describable = describable;
    }

    @Override
    public String printDescription() {
        return describable.printDescription();
    }
}
