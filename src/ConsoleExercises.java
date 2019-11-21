import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        //The value of pi is approximately 3.14.
        System.out.format("The value of pi is approximately %.2f \n", pi);

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

        System.out.print("Enter length and width: ");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        System.out.println("length: " + userInput1);
        System.out.println("width: " + userInput2);




    }
}
