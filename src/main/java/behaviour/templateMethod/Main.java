package behaviour.templateMethod;

public class Main {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.print("\n");

        game = new Football();
        game.play();
    }
}
