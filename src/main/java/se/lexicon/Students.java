package se.lexicon;


import java.util.Arrays;

public class Students {

    public static void main(String[] args) {


        String[] names = new String[2];

        String[] Students = {"John Baptist", "Lund Strong"};
        System.out.println(names.length);

    }

    public static void ex1() {
        String[] numbers = new String[5];
        int[] number = new int[]{6, 8, 2, 5, 9};
        System.out.println(numbers.length);
    }

    public static void ex2() {

        String[] names = new String[3];
        String[] name = new String[]{"Mark", "Lund", "George"};

        names[0] = "John";
        names[1] = "David";
        names[2] = "Luk";
        String[] realcopy = Arrays.copyOf(names, names.length);
        System.out.println(realcopy);
    }

    public static void ex3(){

        int[] numbers = new int[]{6, 8, 4, 7, 9};

    }

}

/**
 * Returns all names in a new array (Retrieves a copy of the names array).
 *
 * @return A new array containing all elements from the names array.
 */
public static String[] findAll() {
    //todo: PART 1: implement findAll method
    return null;
}


/**
 * Finds a name that matches the given fullName case-insensitively.
 *
 * @param fullName The full name to search for.
 * @return The matching name if found; otherwise, null.
 */
public static String find(String fullName) {
    //todo: PART 2: implement find method
    return null;
}


/**
 * Adds a new fullName to the names array if it doesn't already exist.
 *
 * @param fullName The full name to add.
 * @return True if the fullName is added successfully; false if it already exists.
 */
public static boolean add(String fullName) {
    //todo: PART 2: implement add method
    return false;
}


/**
 * Find all names that match the given firstName.
 *
 * @param firstName The first name to search for.
 * @return An array containing all matching names.
 */
public static String[] findByFirstName(String firstName) {
    //todo: PART 3: findByFirstName method
    return null;
}


/**
 * Find all names that match the given lastName.
 *
 * @param lastName The last name to search for.
 * @return An array containing all matching names.
 */
public static String[] findByLastName(String lastName) {
    //todo: PART 3: implement findByLastName method
    return null;
}


/**
 * Updates a name in the names array from the original name to the updated name.
 *
 * @param original    The original name to update.
 * @param updatedName The updated name to set.
 * @return True if the name is updated successfully; false if the updated name already exists or the original name is not found.
 */
public static boolean update(String original, String updatedName) {
    //todo: PART 3: implement update method
    return false;
}


/**
 * Removes a name from the names array, case-insensitively.
 *
 * @param fullName The full name to remove.
 * @return True if the name is removed successfully; false if the name is not found in the array.
 */
public static boolean remove(String fullName) {
    //todo: PART 4: implement remove method
    return false;

}