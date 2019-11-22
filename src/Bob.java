import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Talk to Bob (say \'bye\' to leave conversation):");
        String input = sc.nextLine();
//        boolean loop = true;
        while (!input.equalsIgnoreCase("bye")) {
            if (input.endsWith("?")) {
                System.out.println("Bob: Sure");
            } else if (input.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!");
            } else if (input.trim().equals("")) {
                System.out.println("Bob: Fine. Be that way!");
            } else {
                System.out.println("Bob: Whatever.");
            }
            input = sc.nextLine();
        }

    }
}
