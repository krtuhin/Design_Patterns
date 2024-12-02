package adapter;

public class Main {
    public static void main(String[] args) {

        /*
         * Way to implement Adapter Design Pattern
         * 
         * 1. Create two Objects which are compatible with each other. (iPhone,
         * AppleCharger)
         * 
         * 2. Create an Object that is incompatible with the previous object but we
         * have to use it. (AndroidCharger)
         * 
         * 3. Create an Adapter Object, which will have the incompatible object as
         * property and provide the compatible object. (AdapterCharger)
         * 
         * 4. Now we can use the incompatible Object with the help of the Adapter
         * Object.
         * 
         */

        AppleCharger appleCharger = new AdapterCharger(new ChargerXYZ());

        Iphone iphone = new Iphone(appleCharger);

        iphone.chargeIphone();

    }

}