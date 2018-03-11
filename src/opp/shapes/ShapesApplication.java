package opp.shapes;

public class ShapesApplication {
    public static void main(String[] args) {
        Square square = new Square(4);
        Square square2 = new Square(8);
        Square square3 = new Square(2);
        Square[] squres = {square, square2, square3};


        Shape[] shapes = {new Square(4), new Rectangle(2,3)};
        showShapes(shapes);
        showShapes(squares);

    }

    private static void showSquare(oop.shapes.Square square) {
        for (int i = 0; i < squares.length; i++)
            System.out.println("Field = " + square.field());
            System.out.println("Circuit = " + square.circuit());
            System.out.println("Diagonal = " + square.diagonal());
    }
}
