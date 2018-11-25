package behaviour.command.modelReceiver;


// The receiver class
public class TextFile {
    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    // constructor

    public String open() {
        return "Opening file " + name;
    }

    public String save() {
        return "Saving file " + name;
    }

}
