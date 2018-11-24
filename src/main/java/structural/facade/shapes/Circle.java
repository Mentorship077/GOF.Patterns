package structural.facade.shapes;

import structural.facade.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
