import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        //The value of pi is approximately 3.14.
        System.out.format("The value of pi is approximately %.2f %n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter a Integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println("Word 1: " + userInput1);
//        System.out.println("Word 2: " + userInput2);
//        System.out.println("Word 3: " + userInput3);


//        System.out.print("Enter a sentence: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("Sentence: " + userInput);

        System.out.print("Enter length: ");
        int userInput1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter width: ");
        int userInput2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter height: ");
        int userInput3 = Integer.parseInt(scanner.nextLine());

        int perimeter = (userInput1*2) + (userInput2*2);
        int area = userInput1*userInput2;
        int volume = userInput1*userInput2*userInput3;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);




    }
}
