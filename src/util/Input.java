package util;

import java.util.Scanner;

public class Input {
    public Scanner scanner = new Scanner(System.in);

    public String getString(){
        System.out.println("enter a sting:");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no:");
        String test = scanner.next();
        return test.equalsIgnoreCase("y") || test.equalsIgnoreCase("yes") || test.equalsIgnoreCase("true");
    }

    public int getInt(int min, int max){
        System.out.printf("Enter a number between %s and %s %n",min,max);
        int input = scanner.nextInt();
        if (input < min || input > max){
            return getInt(min,max);
        }else {
            return input;
        }
    }

    public int getInt(){
        System.out.println("enter a integer:");
        return scanner.nextInt();
    }

    public double getDouble(double min, double max){
        System.out.printf("Enter a number between %s and %s %n",min,max);
        double input = scanner.nextDouble();
        if (input < min || input > max){
            return getDouble(min,max);
        }else {
            return input;
        }
    }

    public double getDouble(){
        System.out.println("Enter a double");
        return scanner.nextDouble();
    }
}
