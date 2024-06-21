package se.lexicon;


import java.lang.reflect.Array;
import java.util.Arrays;

public class names {

    public static void main(String[] args) {


        String[] names = new String[2];

        String[] Students = {"John Baptist", "Lund Strong"};
        System.out.println(names.length);

        ex06();

    }

    public static void ex01() {
        String[] numbers = new String[5];
        int[] number = new int[]{6, 8, 2, 5, 9};
        System.out.println(numbers.length);
    }

    public static void ex02() {

        String[] names = new String[3];
        String[] name = new String[]{"Mark", "Lund", "George"};


    }

    public static void ex03() {

        int[] originalArray = {6, 8, 10, 5, 1};
        for (int element : originalArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        int[] newArray = new int[originalArray.length];
        int i = 0;
        originalArray[i] = newArray[i];

        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();

    }

    public static void ex04() {

        String[] names = {"John", "Luk", "Lund", "George"};
        String[] copy = Arrays.copyOf(names, names.length);

        System.out.println("Original:\t" + Arrays.toString(names));
        System.out.println("    Copy:\t" + Arrays.toString(copy));


    }

    public static void ex05() {

        String[] names = {"John", "Luk", "Lund", "George"};

        System.out.println("Unsorted Array:\t" + Arrays.toString(names));

        Arrays.sort(names);
        System.out.println("  Sorted Array:\t" + Arrays.toString(names));


    }

    public static void ex06() {

        String[] originalArray = {"John", "Luk", "Lund"};
        String[] newArray = new String[0];
        for (String element : originalArray) {
            System.out.print(element + " ");

            System.out.println();

            newArray = new String[originalArray.length + 1];


            newArray[newArray.length - 1] = "George";

            for (String name : newArray) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }

    public static void ex07() {

    }

}

/**
 * Find all names that match the given firstName.
 *
 * @param firstName The first name to search for.
 * @return An array containing all matching names.
 * <p>
 * Find all names that match the given lastName.
 * @param lastName The last name to search for.
 * @return An array containing all matching names.
 * <p>
 * Updates a name in the names array from the original name to the updated name.
 * @param original    The original name to update.
 * @param updatedName The updated name to set.
 * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
 * <p>
 * Removes a name from the names array, case-insensitively.
 * @param fullName The full name to remove.
 * @return True if the name is removed successfully; false if the name is not found in the array.
 */

/**
 * Find all names that match the given lastName.
 *
 * @param lastName The last name to search for.
 * @return An array containing all matching names.
 */
/**
 * Updates a name in the names array from the original name to the updated name.
 *
 * @param original    The original name to update.
 * @param updatedName The updated name to set.
 * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
 */


/**
 * Removes a name from the names array, case-insensitively.
 *
 * @param fullName The full name to remove.
 * @return True if the name is removed successfully; false if the name is not found in the array.
 */






