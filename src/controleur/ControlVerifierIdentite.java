package controleur;

import java.util.Objects;
import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		boolean retour = false;
		String[] nomHabithant = village.donnerVillageois();
		for (int i=0 ; i<nomHabithant.length;i++) {
			if (Objects.equals(nomHabithant[i],  nomVendeur)) retour = true;
		}
		return retour ;
	}
}
