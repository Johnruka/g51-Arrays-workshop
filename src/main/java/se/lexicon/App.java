package se.lexicon;


public class App {
    public static void main(String[] args) {

        int size = Students.getSize();
        System.out.println(size);
        Students.setNames(new String[]{"Erik Svensson", "Mehrdad Javan"});
        System.out.println(Students.getSize());
        // call more methods as needed
    }
}
