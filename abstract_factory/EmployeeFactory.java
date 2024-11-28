package abstract_factory;

public class EmployeeFactory {

    // get employee
    public static Employee getEmployee(EmployeeAbstractFactory factory) {
        return factory.createEmployee();
    }

}
