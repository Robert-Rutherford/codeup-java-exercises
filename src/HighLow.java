import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Random random = new Random();
        highLow(random.nextInt(99)+1,0,15);


    }

    private static void highLow(int rand, int numbOfGuess, int maxGuess){
        Scanner sc = new Scanner(System.in);
        if (numbOfGuess == maxGuess){
            System.out.println("GAME OVER! The number is "+rand);
        }else {
            System.out.printf("You have %s guesses left %n", maxGuess-numbOfGuess);
            System.out.print("guess a number between 1 and 100 (enter -1 to quit): ");
            int guess = sc.nextInt();
            if (guess == rand) {
                System.out.println("GOOD GUESS! the Number was " + rand);
            } else if (guess > rand) {
                System.out.println("LOWER");
                numbOfGuess++;
                highLow(rand,numbOfGuess,maxGuess);
            } else if (guess == -1) {
                System.out.println("GAME OVER! The number is "+rand);

            } else if (guess < rand) {
                System.out.println("HIGHER");
                numbOfGuess++;
                highLow(rand,numbOfGuess,maxGuess);
            }
        }
    }
}
