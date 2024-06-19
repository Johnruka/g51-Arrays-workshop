package se.lexicon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 tests for the NameRepository class.
 */
public class StudentsTest {



    public void setUp() {
        Students.clear();
        Students.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
    }


    @Test
    public void testGetSize() {
        int size = Students.getSize();
        assertEquals(2, size);
    }

    /**
     * Test for setNames method.
     * Verifies that setNames correctly sets the names array to the provided array of names.
     */
    @Test
    public void testSetNames() {
        Students.setNames(new String[]{"Alice Wonderland", "Bob Builder"});
        String[] names = Students.findAll();
        assertArrayEquals(new String[]{"Alice Wonderland", "Bob Builder"}, names);
    }

    /**
     * Test for clear method.
     * Ensures that clear empties the names array.
     */
    @Test
    public void testClear() {
        Students.clear();
        assertEquals(0, Students.getSize());
    }

    /**
     * Test for findAll method.
     * Checks that findAll returns a new array containing all names in the names array.
     */
    @Test
    public void testFindAll() {
        String[] names = Students.findAll();
        assertArrayEquals(new String[]{"Erik Svensson", "Mehrdad Javan"}, names);
    }

    /**
     * Test for find method.
     * Verifies that find returns the correct name if found, or null if not found.
     */
    @Test
    public void testFind() {
        String name = Students.find("Mehrdad Javan");
        assertEquals("Mehrdad Javan", name);
        assertNull(Students.find("Non Existent"));
    }

    /**
     * Test for add method.
     * Checks that add adds a new name to the names array and returns true, or returns false if the name already exists.
     */
    @Test
    public void testAdd() {
        boolean added = Students.add("New Person");
        assertTrue(added);
        assertEquals(3, Students.getSize());
        assertFalse(Students.add("Mehrdad Javan")); // Already exists
    }

    /**
     * Test for findByFirstName method.
     * Verifies that findByFirstName returns an array containing all names matching the given first name.
     */
    @Test
    public void testFindByFirstName() {
        String[] result = Students.findByFirstName("Mehrdad");
        assertArrayEquals(new String[]{"Mehrdad Javan"}, result);
        String[] emptyResult = Students.findByFirstName("Non Existent");
        assertArrayEquals(new String[]{}, emptyResult);
    }

    /**
     * Test for findByLastName method.
     * Checks that findByLastName returns an array containing all names matching the given last name.
     */
    @Test
    public void testFindByLastName() {
        String[] result = Students.findByLastName("Javan");
        assertArrayEquals(new String[]{"Mehrdad Javan"}, result);
        String[] emptyResult = Students.findByLastName("Non Existent");
        assertArrayEquals(new String[]{}, emptyResult);
    }

    /**
     * Test for update method.
     * Verifies that update updates a name in the names array and returns true if successful, or returns false in case of failure.
     */
    @Test
    public void testUpdate() {
        boolean updated = Students.update("Erik Svensson", "Erik Johnson");
        assertTrue(updated);
        assertEquals("Erik Johnson", Students.find("Erik Johnson"));
        assertFalse(Students.update("Non Existent", "New Name"));
        assertFalse(Students.update("Nickan Javan", "Mehrdad Javan")); // "Mehrdad Javan" already exists
    }

    /**
     * Test for remove method.
     * Ensures that remove removes a name from the names array and returns true, or returns false if the name is not found.
     */
    @Test
    public void testRemove() {
        boolean removed = Students.remove("Mehrdad Javan");
        assertTrue(removed);
        assertNull(Students.find("Mehrdad Javan"));
        assertFalse(Students.remove("Non Existent"));
    }
}
