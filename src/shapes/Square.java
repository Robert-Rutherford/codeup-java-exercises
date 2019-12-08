package shapes;

//        Inheritance and polymorphism Exercise
//public class Square extends Rectangle {
////    protected int side;
//
//    public Square(int side) {
//        super(side, side);
////            this.side = side;
//    }
//
//    @Override
//    public int getArea() {
////            return side*side;
//        return super.length * super.width;
//    }
//
//    @Override
//    public int getPerimeter() {
////            return 4*side;
//        return 4 * super.length;
//    }
//}

//      Abstract Classes and Interfaces Exercise
public class Square extends Quadrilateral {


    public Square(double side) {
        super(side, side);
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
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}