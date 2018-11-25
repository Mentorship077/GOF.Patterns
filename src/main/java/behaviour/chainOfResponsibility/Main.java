package behaviour.chainOfResponsibility;

import behaviour.chainOfResponsibility.loggers.ConsoleLogger;
import behaviour.chainOfResponsibility.loggers.ErrorLogger;
import behaviour.chainOfResponsibility.loggers.FileLogger;

public class Main {
    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();


        loggerChain.logMessage(AbstractLogger.DEBUG,
                "2. This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "3. This is an error information.");

        loggerChain.logMessage(AbstractLogger.INFO,
                "1. This is an information.");
    }
}
