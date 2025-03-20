package controleur;

import villagegaulois.Village;

public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		// TODO
		return false;
	}

	public int prendreEtal(String nomVendeur, String produit, int nbProduit) {
		
		int numeroEtal = -1;
		if (verifierIdentite(nomVendeur)) {
			System.out.println("Bonjour" + nomVendeur + " je vais regarder si je peux vous trouver un etal\n");
		}
		else {
			System.out.println(("Je suis desole " + nomVendeur + " mais il faut etre "+
					"un habitant du village pour commercer ici\n"));
		}
		return numeroEtal;
	}

	public boolean verifierIdentite(String nomVendeur) {
		boolean estHabitant = controlVerifierIdentite.verifierIdentite(nomVendeur);
		return estHabitant;
	}
}
