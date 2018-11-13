package creational.commonModel;

/**
 * Created  on 16.07.17.
 */
public class MedicalDroid extends AbstractDroid {
    public MedicalDroid() {
        type = "Medical";
    }

    @Override
    public String printDescription() {
        return "It's medical droid";
    }
}
