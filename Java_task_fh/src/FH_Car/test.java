// Test class to demonstrate the use of the vehicle classes

package FH_Car;

import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ArrayList<Vehicle> Vehciles = new ArrayList<Vehicle>();

		ICEV v1 = new ICEV(new Manufacture(2020, "BMW"));
		BEV v2 = new BEV(new Manufacture(2023, "Tesla"));
		HybridV v3 = new HybridV(new Manufacture(2022, "Toyota"));

		Vehciles.add(v1);
		Vehciles.add(v2);
		Vehciles.add(v3);

		for (Vehicle veh : Vehciles) {
			veh.ShowCharacteristics();
		}
	}
}
