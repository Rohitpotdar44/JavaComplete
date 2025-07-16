package Interfaces_25.how_to_achieve_multiple_inheritance;

public class Smartphone implements Camera, Phone {

    @Override
    public void clickPhoto() {
        System.out.println("Smartphone: Photo clicked successfully.");
    }

    @Override
    public void powerOn() {
        System.out.println("Smartphone: Powering on...");
    }

    @Override
    public void endCall() {
        System.out.println("Smartphone: Call ended.");
    }

    @Override
    public void makeCall() {
        System.out.println("Smartphone: Dialing number...");
    }
}
