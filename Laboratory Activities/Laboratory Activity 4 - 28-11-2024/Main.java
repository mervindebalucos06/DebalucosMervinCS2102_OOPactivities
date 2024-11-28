

public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(8, 12);
    Square square = new Square(10);
    Triangle triangle = new Triangle(10, 12, 15);

    Shape[] shapes = { rectangle, square, triangle };
    ShapeCollection shapeCollection = new ShapeCollection(shapes);

    shapeCollection.getPropertyValues();
  }
}
