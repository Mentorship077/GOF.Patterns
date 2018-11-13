package creational.commonModel;

/**
 * Created  on 19.07.17.
 */
public abstract class AbstractDroid implements Cloneable {
    protected String type;
    private String id;

    abstract String printDescription();

    public String getType() {
        return type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
