package FH_Car;

public class Manufacture {
	private int year; // This represent the year when this object created
	private String Manfacturer; // This represent the brand name who manufacture the object

	public Manufacture(int year, String Manfacturer) {
		this.year = year;
		this.Manfacturer = Manfacturer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getManfacturer() {
		return Manfacturer;
	}

	public void setManfacturer(String manfacturer) {
		Manfacturer = manfacturer;
	}

}
