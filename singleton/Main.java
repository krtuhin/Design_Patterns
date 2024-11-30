package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Ways to break singleton pattern
         * 
         * 1. Reflection API to break singleton pattern
         * 
         * 2. Deserialization
         * 
         * 3. Object cloning
         */

        // Reflection API to break singleton pattern
        Constructor<Student> constructor = Student.class.getDeclaredConstructor();
        constructor.setAccessible(true); // changing the access modifier
        Student s1 = constructor.newInstance(); // creating new object

        System.out.println(s1.hashCode());
        System.out.println(Student.getStudent().hashCode());

        // Deserialization to break singleton pattern
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.ob"));
        oos.writeObject(Teacher.getTeacher()); // serialize

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.ob"));
        Teacher t1 = (Teacher) ois.readObject(); // deserialize

        System.out.println(t1.hashCode());
        System.out.println(Teacher.getTeacher().hashCode());

        // Object cloning
        Teacher t2 = (Teacher) t1.clone(); // clone object
        System.out.println(t2.hashCode());
    }
}
