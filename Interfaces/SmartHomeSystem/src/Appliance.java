public abstract class Appliance implements Controllable {

    protected boolean isOn = false;
    private String deviceName = "Cihaz";

    public Appliance() {
       
    }

    public Appliance(String deviceName) {
        this.deviceName = deviceName;
    }

    
    @Override
    public void turnOn() {
       System.out.println(this.deviceName + " açıldı.");
       isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println(this.deviceName +" kapandı.");
        isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    
}