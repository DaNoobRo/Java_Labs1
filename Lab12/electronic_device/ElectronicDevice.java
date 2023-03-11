package Lab12.electronic_device;

public class ElectronicDevice {
    private boolean powered;

    public ElectronicDevice() {
        powered = false;
    }

    public boolean isPowered() {
        return powered;
    }

    protected void turnOn(){
        System.out.println("Device turned ON");
        powered = true;
    }

    protected void turnOff(){
        System.out.println("Device turned OFF");
        powered = false;
    }
}

