package gebruikvanklassen;

public class Alcoholische extends Drank {
	public byte alcoholpercentage;

	@Override
	public String toString() {
		return "Alcoholische [alcoholpercentage=" + alcoholpercentage + ", prijs=" + prijs + ", naam=" + naam + "]";
	}
	
}
