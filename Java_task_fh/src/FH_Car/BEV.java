package FH_Car;

public class BEV extends Vehicle {
	Manufacture M;
	private static final ElectricEngine EE = new ElectricEngine("electrical energy");

	public BEV(Manufacture M){
		this.M = M;
	}

	@Override
	void ShowCharacteristics() {
		System.out.println("BEV [Manufacture{ Year= " + M.getYear() + ", brand name: " + M.getManfacturer()
				+ "}, Engine_Type: " + EE.Type_Of_Energy + " ]");

	}

}
