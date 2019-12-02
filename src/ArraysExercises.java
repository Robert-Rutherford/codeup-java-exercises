import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        Problem 1
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);

        String[] personArray = {"John", "Bob", "Phil"};
        String newPerson = "Jack";
        String[] addedArray = addPerson(personArray, newPerson);
        System.out.println(Arrays.toString(addedArray));


    }

    private static String[] addPerson(String[] arr, String newPerson) {
        String[] returnArr = new String[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            returnArr[i] = arr[i];
        }
        returnArr[arr.length] = newPerson;
        return returnArr;
    }
}
