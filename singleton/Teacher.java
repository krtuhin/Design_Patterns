package singleton;

import java.io.Serializable;

// Eager way of creating singleton object
public class Teacher implements Serializable, Cloneable {

    // initializing one object by default
    private static Teacher teacher = new Teacher();

    // private constructor
    private Teacher() {

    }

    // method to return the same object
    public static Teacher getTeacher() {
        return teacher;
    }

    // prevention of breaking singleton pattern using deserialization
    public Object readResolve() {
        return teacher;
    }

    // prevention of breaking singleton pattern using deserialization
    @Override
    public Object clone() throws CloneNotSupportedException {
        // return super.clone(); // cloning object
        return teacher; // prevent cloning
    }
}
