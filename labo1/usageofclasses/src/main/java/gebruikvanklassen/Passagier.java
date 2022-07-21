package gebruikvanklassen;

public class Passagier {
	public String naam;
	public String voornaam;
	public String geboortedatum; 
	public String rijksregisternr;
	public Passagier(String naam, String voornaam, String rijksregisternr) {
		super();
		this.naam = naam;
		this.voornaam = voornaam;
		this.rijksregisternr = rijksregisternr;
	}
	public Passagier(String naam, String voornaam, String geboortedatum, String rijksregisternr) {
		super();
		this.naam = naam;
		this.voornaam = voornaam;
		this.geboortedatum = geboortedatum;
		this.rijksregisternr = rijksregisternr;
	}
	@Override
	public String toString() {
		return "Passagier [naam=" + naam + ", voornaam=" + voornaam + ", geboortedatum=" + geboortedatum
				+ ", rijksregisternr=" + rijksregisternr + "]";
	}
	
	
	
	
	

}
