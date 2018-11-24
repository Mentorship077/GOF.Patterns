package structural.facade;

import structural.facade.shapes.Circle;
import structural.facade.shapes.Rectangle;
import structural.facade.shapes.Square;

public class ShapeMaker {
    private Shape circle;
    private Shape square;
    private Shape rectangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }
}
