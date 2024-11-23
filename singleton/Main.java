package singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println(Student.getStudent().hashCode());
        System.out.println(Student.getStudent().hashCode());

        System.out.println(Teacher.getTeacher().hashCode());
        System.out.println(Teacher.getTeacher().hashCode());

    }
}
