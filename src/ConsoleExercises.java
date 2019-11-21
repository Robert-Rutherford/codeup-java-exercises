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

//        scanner.nextLine();
//        System.out.print("Enter a sentence: ");
//        String sentence = scanner.nextLine();
//        System.out.println("Sentence: " + sentence);

//        System.out.print("Enter length: ");
//        float length = Float.parseFloat(scanner.nextLine());
//        System.out.print("Enter width: ");
//        float width = Float.parseFloat(scanner.nextLine());
//        System.out.print("Enter height: ");
//        float height = Float.parseFloat(scanner.nextLine());
//
//        float perimeter = (length*2) + (width*2);
//        float area = length*width;
//        float volume = length*width*height;
//        System.out.printf("Perimeter: %.2f %n", perimeter);
//        System.out.printf("Area: %.2f %n", area);
//        System.out.printf("Volume: %.2f %n", volume);

        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        String str = sc.next();
        System.out.println(str);


    }
}
