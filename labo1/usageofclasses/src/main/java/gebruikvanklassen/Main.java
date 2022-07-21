package gebruikvanklassen;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Passagier persoon = new Passagier("Slecht", "Weer", "21.07.2022342344");
		Vlucht vliegtuig = new Vlucht(Bestemming.KEULEN, "7 uur", "DL78");
		vliegtuig.passagiersLijst.add(persoon);
		System.out.println(vliegtuig);
		
	}

}
