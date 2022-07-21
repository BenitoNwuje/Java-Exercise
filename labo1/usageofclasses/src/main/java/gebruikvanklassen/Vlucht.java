package gebruikvanklassen;

import java.util.ArrayList;

public class Vlucht {
	public final Bestemming bestemming;
	public String vetrek = "Brussel";
	public String tijdstip;
	public String vluchtnr;
	ArrayList<Passagier> passagiersLijst = new ArrayList<Passagier>();

	public Vlucht(Bestemming bestemming, String tijdstip, String vluchtnr) {
		super();
		this.bestemming = bestemming;
		this.tijdstip = tijdstip;
		this.vluchtnr = vluchtnr;
	}

	@Override
	public String toString() {
		return "Vlucht [bestemming=" + bestemming + ", vetrek=" + vetrek + ", tijdstip=" + tijdstip + ", vluchtnr="
				+ vluchtnr + ", passagiersLijst=" + passagiersLijst + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
