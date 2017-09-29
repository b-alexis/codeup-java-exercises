package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        myShape = new Rectangle(5,4);

        System.out.println("area:" + myShape.getArea());
        System.out.println("perimeter" + myShape.getPerimeter());

    }
}

