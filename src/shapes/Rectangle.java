package shapes;

//        Inheritance and polymorphism Exercise
//public class Rectangle {
//    private int length;
//    private int width;
//
//    public Rectangle(int Length, int Width){
//        length = Length;
//        width = Width;
//    }
//
//    public int getLength(){
//        return length;
//    }
//
//    public int getWidth(){
//        return width;
//    }
//
//    public int getArea(){
//        return length*width;
//    }
//
//    public int getPerimeter(){
//        return (2*length)+(2*width);
//    }
//
//}

//      Abstract Classes and Interfaces Exercise

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(int Width, int Length) {
        super(Width, Length);
    }

    @Override
    public void setLength(int Length) {

    }

    @Override
    public void setWidth(int Width) {

    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
