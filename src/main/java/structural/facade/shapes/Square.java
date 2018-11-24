package structural.facade.shapes;

import structural.facade.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
