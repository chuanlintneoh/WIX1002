public class Tester {
    public static void main(String[] args) {
        Shape a = new Shape("Shape");
        Rectangle rectangle = new Rectangle("Rectangle");
        Square square = new Square("Square");
        Circle circle = new Circle("Circle");
        System.out.println("Shape");
        a.display();

        System.out.println();
        System.out.println("Rectangle");
        rectangle.input();
        rectangle.display();

        System.out.println();
        System.out.println("Square");
        square.input();
        square.display();

        System.out.println();
        System.out.println("Circle");
        circle.input();
        circle.display();
    }
}
