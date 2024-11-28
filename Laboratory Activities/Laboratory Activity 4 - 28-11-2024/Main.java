public class Main {
  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(7, 10);
    Square square = new Square(9);
    Triangle triangle = new Triangle(5, 8, 10);

    Shape[] shapes = { rectangle, square, triangle };
    ShapeCollection shapeCollection = new ShapeCollection(shapes);

    shapeCollection.getPropertyValues();
  }
}
