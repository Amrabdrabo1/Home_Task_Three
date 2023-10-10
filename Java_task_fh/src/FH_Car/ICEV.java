package FH_Car;

public class ICEV extends Vehicle {
	Manufacture M;
	private static final CombustionEngine CE = new CombustionEngine("Gas");

	public ICEV(Manufacture M) {
		this.M = M;
		
	}

	@Override
	void ShowCharacteristics() {
		System.out.println("ICEV [Manufacture{ Year= " + M.getYear() + ", brand name: " + M.getManfacturer()
				+ "}, Engine_Type: " + CE.Type_Of_Energy +" ]");

	}


}
