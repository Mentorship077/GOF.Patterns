package creational.commonModel;

/**
 * Created  on 16.07.17.
 */
public class BiologicalDroid extends AbstractDroid {
    public BiologicalDroid() {
        type = "Biological";
    }

    public String printDescription() {
        return "It's biological droid";
    }
}
