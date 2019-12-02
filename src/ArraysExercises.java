import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
//        Problem 1
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person per1 = new Person("John");
        Person per2 = new Person("Bob");
        Person per3 = new Person("Phil");
        Person[] personArray = {per1,per2,per3};
//        String[] personArray = {"John", "Bob", "Phil"};
        Person newPerson = new Person("Jack");
        Person[] addedArray = addPerson(personArray, newPerson);
//        System.out.println(Arrays.toString(addedArray));


    }

    private static Person[] addPerson(Person[] arr, Person newPerson) {
        Person[] returnArr = new Person[arr.length + 1];
        System.arraycopy(arr, 0, returnArr, 0, arr.length);
        returnArr[arr.length] = newPerson;
        return returnArr;
    }
}
