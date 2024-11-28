public class Main {
    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("web Developer");
        System.out.println("Salary : " + employee.getSalary());

        System.out.println(EmployeeFactory.getEmployee("ANDROID DEVELOPER").getSalary());
    }

}
