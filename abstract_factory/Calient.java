package abstract_factory;

public class Calient {
    public static void main(String[] args) {

        Employee emp1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        emp1.name();

        EmployeeFactory.getEmployee(new WebDevFactory()).name();
    }

}
