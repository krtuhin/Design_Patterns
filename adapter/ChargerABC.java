package adapter;

public class ChargerABC implements AppleCharger {

    @Override
    public void chargePhone() {
        System.out.println("Your Iphone is charging...");
    }

}
