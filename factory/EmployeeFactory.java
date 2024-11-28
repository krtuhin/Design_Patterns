public class EmployeeFactory {

    public static Employee getEmployee(String empType) {

        if (empType.trim().equalsIgnoreCase("android developer")) {
            return new AndroidDeveloper();
        } else if (empType.equalsIgnoreCase("web developer")) {
            return new WebDeveloper();
        } else {
            return null;
        }

    }

}
