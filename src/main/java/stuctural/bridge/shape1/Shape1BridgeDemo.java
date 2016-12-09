package stuctural.bridge.shape1;

public class Shape1BridgeDemo {

    public static void main(String[] args) {

        Circle circle = new RedCircle();
        Square square = new BlueSquare();

        circle.applyColor();
        square.applyColor();
    }
}
