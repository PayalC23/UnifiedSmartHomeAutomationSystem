package HomeAutomationSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SmartHomeController {
	private List<AbstractSmartDevice> devices;

    public SmartHomeController() {
        devices = new ArrayList<>();
    }

    public void addDevice(AbstractSmartDevice device) {
        devices.add(device);
    }

    public void turnAllDevicesOn() {
        for (AbstractSmartDevice device : devices) {
            device.turnOn();
        }
    }

	public AbstractSmartDevice findDeviceById(String deviceId) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the device ID to find:"); String inputDeviceId =
		 * sc.nextLine();
		 */

		for (AbstractSmartDevice device : devices) {
	        if (device.getDeviceId().equals(deviceId)) {
	            return device;
	        }
		}
		return null;
	}

	public void turnAllDevicesOff() {
		for (AbstractSmartDevice device : devices) {
	        device.turnOff();
		
	}
	}

	public Object[] devices() {
		 List<AbstractSmartDevice> deviceList = new ArrayList<>();
		    
		    
		    return deviceList.toArray(new AbstractSmartDevice[0]);
		}
	}

	
	

	
