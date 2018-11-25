package behaviour.mediator;

public class Main {
    public static void main(String[] args) {
        User robert = new User("Robert", 8);
        User john = new User("John",19);

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
