package HomeAutomationSys;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		SmartHomeController controller = new SmartHomeController();
		HomeUI ui = new HomeUI(controller);

		
		SmartLight light = new SmartLight("L1", "Living Room Light");
		SmartThermostat thermostat = new SmartThermostat("T1", "Living Room Thermostat");
		SmartCamera camera = new SmartCamera("C1", "Living Room Camera");

		
		ui.addDevice(light);
		ui.addDevice(thermostat);
		ui.addDevice(camera);

		// Control devices
		ui.turnAllDevicesOn();
		System.out.println("-------------------------------------------------------------");

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the device ID to control:");
		String deviceId = sc.nextLine();

		
		AbstractSmartDevice device = controller.findDeviceById(deviceId);

		if (device != null) {
			// Control the device
			ui.controlDevice(device);
		} else {
			System.out.println("No device found with ID: " + deviceId);
		}
		System.out.println("-------------------------------------------------------------");
		ui.turnAllDevicesOff();
	}

}
