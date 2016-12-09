package stuctural.bridge.shape2;

public class Shape2BridgeDemo {

    public static void main(String[] args) {

        Color blue = new Blue();
        Shape square = new Square(blue);

        Color red = new Red();
        Shape circle = new Circle(red);

        Color green = new Green();
        Shape greenCircle = new Circle(green);

        circle.applyColor();
        square.applyColor();
        greenCircle.applyColor();
    }
}
