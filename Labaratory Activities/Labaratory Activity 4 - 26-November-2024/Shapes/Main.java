public class Main {
    public static void main(String[] args) {
        Square square = new Square(12);
        Rectangle rectangle = new Rectangle(9, 13);
        Triangle triangle = new Triangle(11, 13, 16);

        Shape[] shapes = {square, rectangle, triangle};
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.getPropertyValues();
    }
}

