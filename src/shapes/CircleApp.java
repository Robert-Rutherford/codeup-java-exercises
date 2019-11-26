package shapes;

import util.Input;

public class CircleApp {
    private static int circlesCreated;
    public static void main(String[] args) {
        Input inputUtil = new Input();
        circlesCreated = 0;
        do {
            double radius = inputUtil.getDouble("Input a radius:");
            Circle circle = new Circle(radius);
            System.out.printf("Area: %.2f%n", circle.getArea());
            System.out.printf("Circumference: %.2f%n", circle.getCircumference());
            circlesCreated++;
            System.out.println();
        }while (inputUtil.yesNo("Continue? (yes/no)"));
        System.out.printf("Exiting program. Created %s circle(s).%n",circlesCreated);

    }
}
