package FactoryPattern;

import FactoryPattern.Shapes.Shape;
import FactoryPattern.Shapes.ShapeFactory;

public class FactoryPatternMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory1 = new ShapeFactory();
        Shape shape1=shapeFactory1.getShape(ShapeName.Circle.name());
        shape1.draw();

        ShapeFactory shapeFactory2 = new ShapeFactory();
        Shape shape2=shapeFactory2.getShape(ShapeName.Rectangle.name());
        shape2.draw();

    }
}
