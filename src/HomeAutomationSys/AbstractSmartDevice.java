package HomeAutomationSys;

public abstract class AbstractSmartDevice {
	
	
	    private String deviceId;
	    private String deviceName;

	    public AbstractSmartDevice(String deviceId, String deviceName) {
	        this.deviceId = deviceId;
	        this.deviceName = deviceName;
	    }

	    public String getDeviceId() {
			return deviceId;
		}

		public String getDeviceName() {
			return deviceName;
		}

		public abstract void turnOn();
	    public abstract void turnOff();
	}

	
	 interface ISmartLight {
	    void turnOn();
	    void turnOff();
	    void setBrightness(int level);
	    void setColor(String color);
	}

	
	interface ISmartThermostat {
	    void setTemperature(int temperature);
	}

	
	 interface ISmartCamera {
	    void startRecording();
	    void stopRecording();
	}

