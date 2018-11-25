package behaviour.command.command;

import behaviour.command.modelReceiver.TextFile;

// Command classes
public class SaveTextFileOperation implements TextFileOperation {

    private TextFile textFile;

    public SaveTextFileOperation(TextFile textFile) {
        this.textFile= textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }

}
