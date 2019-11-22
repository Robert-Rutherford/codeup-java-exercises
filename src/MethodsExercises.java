import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        Problem 1
        int value1 = 10;
        int value2 = 5;
        System.out.println(addition(value1, value2));
        System.out.println(subtraction(value1, value2));
        System.out.println(multiplication(value1, value2));
        System.out.println(division(value1, value2));
        System.out.println(modulus(value1, value2));
        System.out.println();
        System.out.println();
//      Problem 2
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

//      Problem 3
        factorial(1,10);

//      Problem 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Sides for your dice: ");
        int sides = scanner.nextInt();
        diceRoll(sides);

//       Problem 5


    }

    //    problem 1
    private static int addition(int val1, int val2) {
        return val1 + val2;
    }

    private static int subtraction(int val1, int val2) {
        return val1 - val2;
    }

    private static int multiplication(int val1, int val2) {
        return val1 * val2;
    }

    private static int division(int val1, int val2) {
        return val1 / val2;
    }

    private static int modulus(int val1, int val2) {
        return val1 % val2;
    }

    //  Problem 2
    private static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input < min || input > max) {
            System.out.printf("Number is not within range...%nEnter a number between %s and %s: ", min, max);
            input = sc.nextInt();
        }
        System.out.println("Number within Range...\nEnding problem 2...");
        return input;
    }
//    Problem 3
    private static void factorial(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number between %s and %s: ",min, max);
        int number = getInteger(min,max);
        int total = 1;
        boolean continueLoop = true;
        while (continueLoop){
            System.out.printf("%s! = ",number);
            for (int i = 1; i <= number; i++){
                if (i == number){
                    System.out.printf("%s",i);
                }else {
                    System.out.printf("%s x ",i);
                }
                total *= i;
            }
            System.out.printf(" = %s %n",total);
            System.out.println("Continue? (Yes/No)");
            String continueInput = sc.next();
            if (continueInput.equalsIgnoreCase("yes")){
                System.out.printf("Enter a number between %s and %s: ",min, max);
                number = getInteger(min,max);
                total = 1;
            }else {
                System.out.println("Ending function...");
                continueLoop = false;
            }
        }
    }
//  Problem 4
    private static void diceRoll(int sidesNum){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean loop = true;
        while (loop){
            System.out.print("Roll? (yes/no): ");
            String rollInput = sc.next();
            if (rollInput.equalsIgnoreCase("yes")){
                System.out.println();
                System.out.print("Dice Rolls: ");
                for (int i =1;i<=2;i++){
                    System.out.printf("%s ", (random.nextInt(sidesNum -1)+1));
                }
                System.out.println();
                System.out.println();
            }else if (rollInput.equalsIgnoreCase("no")){
                loop = false;
            }else {
                System.out.println("Error: please enter yes or no...");
            }
        }
    }
//  Problem 5
    private static void guessGame(){

    }

}
