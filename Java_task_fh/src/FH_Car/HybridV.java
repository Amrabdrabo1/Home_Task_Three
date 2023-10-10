package FH_Car;

public class HybridV extends Vehicle{
	Manufacture M;
	private static final HybridEngine HE = new HybridEngine("Oil and electrical energy");
	
	public HybridV(Manufacture M) {
		this.M = M;
	}
	
	@Override
	void ShowCharacteristics() {
		System.out.println("HybridV [Manufacture{ Year= " + M.getYear() + ", brand name: " + M.getManfacturer()
		+ "}, Engine_Type: " + HE.Type_Of_Energy + " ]");
		
	}

}
