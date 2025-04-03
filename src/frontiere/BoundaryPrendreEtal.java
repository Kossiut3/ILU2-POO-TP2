package frontiere;

import java.util.concurrent.ForkJoinTask;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean esthabitant = controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!esthabitant) {
			System.out.println("Je suis desole " + nomVendeur +", mais il faut etre un habitant de"
					+ " notre village pour commercer ici. " );
		}
		else {
			System.out.println("Bonjour "+nomVendeur+ " je vais regarder si je peux vous trouver un etal.");
			boolean etalDispo = controlPrendreEtal.resteEtals();
			if(!etalDispo) {
				System.out.println("Desole " + nomVendeur + " je n ai plus d'etal qui ne soit pas deja occupe." );
				
			}
			else {
				installerVendeur(nomVendeur);
			}
				
		}
	}

	private void installerVendeur(String nomVendeur) {
		StringBuilder question = new StringBuilder();
		question.append("C'est parfait, il me reste un etal pour vous\n");
		question.append("Il me faudrait quelques renseignements :");
		System.out.println(question);
		String produit = Clavier.entrerChaine("Quels produits souhait� vous vendre");
		int nbProduit = Clavier.entrerEntier("Combien souhait� vous en vendre\n");
		int numetal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		if (numetal !=-1) {
			System.out.println("Le vendeur "+nomVendeur+" s'est installer a l etal n° " + numetal);
		}
	}
}
