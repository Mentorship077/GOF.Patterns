package behaviour.command.client;

import behaviour.command.invoker.TextFileOperationExecutor;
import behaviour.command.modelReceiver.TextFile;

public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        TextFile textFile = new TextFile("file1.txt");
        System.out.println(
                textFileOperationExecutor.executeOperation(textFile::open) + "\n"+
                        textFileOperationExecutor.executeOperation(textFile::save)
        );
    }
}
