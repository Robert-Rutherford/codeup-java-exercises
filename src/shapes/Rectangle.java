package shapes;



//        Inheritance and polymorphism Exercise
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int Length, int Width){
        length = Length;
        width = Width;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    public int getArea(){
        return length*width;
    }

    public int getPerimeter(){
        return (2*length)+(2*width);
    }

}
