import java.util.Random;

public class ServerNameGenerator {
    private static String[] nouns = {"cat", "mouse", "dog", "bird", "pig", "cow", "chair", "house", "table", "car"};
    private static String[] adjectives = {"tired", "hungry", "angry", "happy", "sad", "colorful", "plain", "fat", "skinny", "energetic"};


    public static String randomElement(String[] arr) {
        Random rand = new Random();
        int index = rand.nextInt(arr.length);
        return arr[index];
    }

    public static void main(String[] args) {
        String randNoun = randomElement(nouns);
        String randAdj = randomElement(adjectives);
        System.out.printf("Here is your server name:%n%s-%s%n", randAdj, randNoun);
    }
}
