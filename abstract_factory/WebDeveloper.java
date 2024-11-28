package abstract_factory;

public class WebDeveloper implements Employee {

    @Override
    public int salary() {
        System.out.println("Getting Web Developer salary...");
        return 40000;
    }

    @Override
    public String name() {
        System.out.println("I am Web Developer");
        return "Web Developer";
    }

}
