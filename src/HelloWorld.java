public class HelloWorld {
        public static void main(String[] args) {
            System.out.print("Hello, ");
            System.out.println("World!");

            int myFavoriteNumber = 10;
            System.out.println(myFavoriteNumber);

            String myString = "This string is mine.";
            System.out.println(myString);

            double myNumber = 3.14;
            System.out.println(myNumber);

//            int x = 5;
//            System.out.println(x++);
//            System.out.println(x);

//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);

//            int class
//            String theNumberThree = "three";
//            Object o = theNumberThree;
//            int three = (int) o;
//            int three = (int) "three";

            int x = 4;
//            x = x + 5;
            x += 5;
            System.out.println(x);

            x = 3;
            int y = 4;
//            y = y * x;
            y *= x;
            System.out.println(y);

            x = 10;
            y = 2;
//            x = x / y;
            x /= y;
            System.out.println(x);
            y -= x;
            System.out.println(y);

        }
}
