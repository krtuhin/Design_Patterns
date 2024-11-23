package singleton;

// Lazy way to create singleton object 
public class Student {

    // private variable
    private static Student student;

    // constructor
    private Student() {

    }

    // method to get object
    public static Student getStudent() {
        // check object available or not
        if (student == null) {

            // only one thread can access at a time (synchronized block)
            synchronized (Student.class) {
                if (student == null) {
                    // create object of this class
                    student = new Student();
                }
            }

        }
        return student;
    }

    /*
     * 1. constructor private
     * 
     * 2. create object with the help of a method
     * 
     * 3. create a private field to store object
     * 
     */
}