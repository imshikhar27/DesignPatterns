package FactoryPattern.Shapes;

public class ShapeFactory {
    public Shape shape = null;
    public Shape getShape(String shapeType) {

        switch (shapeType) {
            case "Circle":
                shape = new Circle();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Square":
                shape = new Square();
                break;
            default:
                System.out.println("Invalid shapeType");
        }
        return shape;
    }
}
