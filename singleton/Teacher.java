package singleton;

// Eager way of creating singleton object
public class Teacher {

    // initializing one object by default
    private static Teacher teacher = new Teacher();

    // private constructor
    private Teacher() {

    }

    // method to return the same object
    public static Teacher getTeacher() {
        return teacher;
    }
}
