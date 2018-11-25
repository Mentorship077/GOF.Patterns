package behaviour.iterator2;

public class Main {
    public static void main(String[] args) {

        RedHead redHead = new RedHead();

        redHead.add(new Weasley("Arthur"));
        redHead.add(new Weasley("Molly"));
        redHead.add(new Weasley("Bill"));
        redHead.add(new Weasley("Charlie"));
        redHead.add(new Weasley("Percy"));
        redHead.add(new Weasley("Fred"));
        redHead.add(new Weasley("George"));
        redHead.add(new Weasley("Ron"));
        redHead.add(new Weasley("Ginny"));

        for (RedHead rh : redHead) {
            System.out.println(rh);
        }
    }
}
