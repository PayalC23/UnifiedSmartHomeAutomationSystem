package HomeAutomationSys;

public class SmartCamera extends AbstractSmartDevice implements ISmartCamera {
    private boolean isRecording;

    public SmartCamera(String deviceId, String deviceName) {
        super(deviceId, deviceName);
}

	@Override
	public void startRecording() {
		isRecording = true;
        System.out.println("Smart Camera " + getDeviceName() + " started recording");
		
	}

	@Override
	public void stopRecording() {
		 isRecording = false;
	        System.out.println("Smart Camera " + getDeviceName() + " stopped recording");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Smart Camera " + getDeviceName() + " turned on");
		
	}

	@Override
	public void turnOff() {
		 System.out.println("Smart Camera " + getDeviceName() + " turned off");
		
	}

	
	}
