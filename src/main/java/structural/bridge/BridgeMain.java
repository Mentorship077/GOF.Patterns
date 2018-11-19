package structural.bridge;

import structural.bridge.circle.GreenCircle;
import structural.bridge.circle.RedCircle;

public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
