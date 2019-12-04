package shapes;

//        Inheritance and polymorphism Exercise
public class Square extends Rectangle {
//    protected int side;

    public Square(int side) {
        super(side, side);
//            this.side = side;
    }

    @Override
    public int getArea() {
//            return side*side;
        return super.length * super.width;
    }

    @Override
    public int getPerimeter() {
//            return 4*side;
        return 4 * super.length;
    }
}

//      Abstract Classes and Interfaces Exercise
//public class Square extends Quadrilateral{
//
//
//    public Square(int Width, int Length) {
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