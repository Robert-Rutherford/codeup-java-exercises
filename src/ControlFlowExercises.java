import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.printf("%s ", i++);
        }
        System.out.println();

        int j = 100;
        do {
            System.out.println(j);
            j -= 5;
        } while (j >= -10);
        System.out.println();

        double k = 2;
        do {
            System.out.printf("%.0f %n", k);
            k = Math.pow(k, 2);
//        k = k * k;
        } while (k <= 1000000);
        System.out.println();

        for (int s = 100; s >= -10; s -= 5) {
            System.out.println(s);
        }
        System.out.println();

        for (double l = 2; l <= 1000000; l = Math.pow(l, 2)) {
            System.out.printf("%.0f %n", l);
        }
        System.out.println();

        for (int q = 5; q <= 15; q++) {
            System.out.printf("%s ", q);
        }
        System.out.println();

        for (int o = 0; o <= 100; o++) {
            if (o % 3 == 0 && o % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (o % 3 == 0) {
                System.out.println("fizz");
            } else if (o % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(o);
            }
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        boolean continueLoop = true;
        while (continueLoop) {
            System.out.print("What number would you like to go up to? ");
            double powInput = scanner.nextDouble();
//            scanner.nextLine();
            double squareOut;
            double cubedOut;
            System.out.println();
            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number | squared | cubed\n" +
                    "------ | ------- | -----");
            for (double f = 1; f <= powInput; f++) {
                squareOut = Math.pow(f, 2);
                cubedOut = Math.pow(f, 3);
                System.out.printf("%.0f      | %.0f      | %.0f %n", f, squareOut, cubedOut);
            }
            System.out.println();
            System.out.println();
            System.out.print("Continue? (y/n): ");
            String continueInput = scanner.next();
//            scanner.nextLine();
            if (continueInput.equalsIgnoreCase("n")) {
                continueLoop = false;
                System.out.println("Ending Loop");
                System.out.println();
            } else {
                System.out.println("Continuing....");
                System.out.println();
            }
        }

        continueLoop = true;
        while (continueLoop) {
            System.out.print("Enter a Grade between 0 to 100:   ");
            int grade = scanner.nextInt();
//            scanner.nextLine();
            System.out.println();
            String letterGrade;
            if (grade >= 97) {
                letterGrade = "A+";
            } else if (grade >= 94) {
                letterGrade = "A";
            } else if (grade >= 88) {
                letterGrade = "A-";
            } else if (grade >= 86) {
                letterGrade = "B+";
            } else if (grade >= 83) {
                letterGrade = "B";
            } else if (grade >= 80) {
                letterGrade = "B-";
            } else if (grade >= 77) {
                letterGrade = "C+";
            } else if (grade >= 73) {
                letterGrade = "C";
            } else if (grade >= 67) {
                letterGrade = "C-";
            } else if (grade >= 65) {
                letterGrade = "D+";
            } else if (grade >= 63) {
                letterGrade = "D";
            } else if (grade >= 60) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }
            System.out.println("Letter grade is: " + letterGrade);
            System.out.println();
            System.out.print("Continue? (y/n): ");
            String continueInput = scanner.next();
//            scanner.nextLine();
            if (continueInput.equalsIgnoreCase("n")) {
                continueLoop = false;
                System.out.println("Ending Loop");
                System.out.println();
            } else {
                System.out.println("Continuing....");
                System.out.println();
            }
        }


    }
}
