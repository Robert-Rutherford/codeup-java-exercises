package shapes;

//        Inheritance and polymorphism Exercise
public class Rectangle {
    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea() {
        return length * width;
    }

    public int getPerimeter() {
        return (2 * length) + (2 * width);
    }

}

//      Abstract Classes and Interfaces Exercise

//public class Rectangle extends Quadrilateral implements Measurable {
//    public Rectangle(int Width, int Length) {
//        super(Width, Length);
//    }
//
//    @Override
//    public void setLength(int Length) {
//
//    }
//
//    @Override
//    public void setWidth(int Width) {
//
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 0;
//    }
//
//    @Override
//    public double getArea() {
//        return 0;
//    }
//}
