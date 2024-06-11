package HomeAutomationSys;

public class HomeUI {
	
	    private SmartHomeController controller;

	    public HomeUI(SmartHomeController controller) {
	        this.controller = controller;
	    }

	    public void addDevice(AbstractSmartDevice device) {
	        controller.addDevice(device);
	    }

	    public void controlDevice(AbstractSmartDevice device) {
	    	
	    	    if (device instanceof ISmartLight) {
	    	        ISmartLight light = (ISmartLight) device;
	    	        System.out.println("Controlling Smart Light: " + ((AbstractSmartDevice) light).getDeviceName());
	    	        light.turnOn();
	    	        light.setBrightness(80);
	    	        light.setColor("White");
	    	    } else if (device instanceof ISmartThermostat) {
	    	        ISmartThermostat thermostat = (ISmartThermostat) device;
	    	        System.out.println("Controlling Smart Thermostat: " + ((AbstractSmartDevice) thermostat).getDeviceName());
	    	        thermostat.setTemperature(18);
	    	    } else if (device instanceof ISmartCamera) {
	    	        ISmartCamera camera = (ISmartCamera) device;
	    	        System.out.println("Controlling Smart Camera: " + ((AbstractSmartDevice) camera).getDeviceName());
	    	        camera.startRecording();
	    	    } else {
	    	        System.out.println("Unsupported device type: " + device.getDeviceName());
	    	    }
	    	}
	    

	    public void turnAllDevicesOn() {
	        controller.turnAllDevicesOn();
	    }

	    public void turnAllDevicesOff() {
	    	
	    	    controller.turnAllDevicesOff();
}
}


