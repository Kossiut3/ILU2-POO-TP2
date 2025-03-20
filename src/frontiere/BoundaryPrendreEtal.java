package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		
	}

	private void installerVendeur(String nomVendeur) {
		StringBuilder question = new StringBuilder();
		question.append("C'est parfait, il me reste un etal pour vous\n");
		question.append("Il me faudrait quelques renseignements :");
		System.out.println(question);
		String produit = Clavier.entrerChaine("Quels produits souhaité vous vendre");
		int nbProduit = Clavier.entrerEntier("Combien souhaité vous en vendre\n");
		int numetal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
		
	}
}
