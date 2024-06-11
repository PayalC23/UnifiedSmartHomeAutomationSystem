package HomeAutomationSys;

public class SmartLight extends AbstractSmartDevice implements ISmartLight {
    private boolean isOn;
    private int brightness;
    private String color;

    public SmartLight(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

	@Override
	public void setBrightness(int level) {
		brightness = level;
        System.out.println("Smart Light " + getDeviceName() + " brightness set to " + level);
		
	}

	@Override
	public void setColor(String color) {
		this.color = color;
        System.out.println("Smart Light " + getDeviceName() + " color set to " + color);
		
	}

	@Override
	public void turnOn() {
		isOn = true;
        System.out.println("Smart Light " + getDeviceName() + " turned on");
		
	}

	@Override
	public void turnOff() {
		 isOn = false;
	        System.out.println("Smart Light " + getDeviceName() + " turned off");
	}
}
