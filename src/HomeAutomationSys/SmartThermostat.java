package HomeAutomationSys;

public class SmartThermostat extends AbstractSmartDevice implements ISmartThermostat {
    private int temperature;

    public SmartThermostat(String deviceId, String deviceName) {
        super(deviceId, deviceName);
    }

	@Override
	public void setTemperature(int temperature) {
		this.temperature = temperature;
        System.out.println("Smart Thermostat " + getDeviceName() + " temperature set to " + temperature);
	}

	@Override
	public void turnOn() {
		System.out.println("Smart Thermostat " + getDeviceName() + " turned on");
		
		
	}

	@Override
	public void turnOff() {
	    System.out.println("Smart Thermostat " + getDeviceName() + " turned off");
		
	}

	
	
}
