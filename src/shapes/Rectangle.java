package shapes;

//        Inheritance and polymorphism Exercise
//public class Rectangle {
//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter() {
//        return (2 * length) + (2 * width);
//    }
//
//}

//      Abstract Classes and Interfaces Exercise

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return 2*length+2*width;
    }

    @Override
    public double getArea() {
        return length*width;
    }
}
