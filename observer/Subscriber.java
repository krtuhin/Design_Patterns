package observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notified(String title) {
        System.out.println("Hello, " + this.name + "! Notification : New video uploaded (" + title + ") ..!");
    }

}
