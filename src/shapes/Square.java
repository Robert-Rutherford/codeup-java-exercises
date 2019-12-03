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
