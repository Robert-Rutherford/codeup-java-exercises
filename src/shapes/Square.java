package shapes;

//        Inheritance and polymorphism Exercise
public class Square extends Rectangle {
    private int side;
        public Square(int Side){
            super(Side,Side);
            side = Side;
        }

        public int getArea(){
            return 4*side;
        }

        public int getPerimeter(){
            return side*side;
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