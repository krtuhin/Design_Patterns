package prototype;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Creating object using prototype design pattern...");

        /*
         * Way to implement prototype design pattern
         * 
         * 1. Override clone method
         * 
         * 2. Create new object
         * 
         * 3. Create copy of object as you need, using colne method rather than creating
         * a new instance from scratch
         * 
         */

        // create new object from scratch
        NetworkConnection networkConnection = new NetworkConnection();

        networkConnection.setIp("192.168.2.1");
        networkConnection.loadImportantData();

        System.out.println(networkConnection);

        // create prototype or clone object
        NetworkConnection connection = null;

        try {
            connection = (NetworkConnection) networkConnection.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(connection);

    }
}