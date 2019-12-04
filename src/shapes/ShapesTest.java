package shapes;

public class ShapesTest {
    public static void main(String[] args) {
//        Inheritance and polymorphism Exercise
//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println(box1.getArea());
//        System.out.println(box1.getPerimeter());
//        Square box2 = new Square(5);
//        System.out.println(box2.getArea());
//        System.out.println(box2.getPerimeter());


        //      Abstract Classes and Interfaces Exercise
        Measurable myShape = new Rectangle(4, 5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());


    }
}
