package gebruikvanklassen;

public class TvProgramma {
	public String naam;
	public Presentator presentator;
	public String tijdsduur;
	public String uitzendtijdstip;
	public Genre genre;
	@Override
	public String toString() {
		return "TvProgramma [naam=" + naam + ", presentator=" + presentator + ", tijdsduur=" + tijdsduur
				+ ", uitzendtijdstip=" + uitzendtijdstip + ", genre=" + genre + "]";
	}
	

}

