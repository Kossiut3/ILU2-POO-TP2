package frontiere;

import controleur.ControlLibererEtal;

public class BoundaryLibererEtal {
	private ControlLibererEtal controlLibererEtal;

	public BoundaryLibererEtal(ControlLibererEtal controlLibererEtal) {
		this.controlLibererEtal = controlLibererEtal;
	}

	public void libererEtal(String nomVendeur) {
		String[] donneesEtals = new String[5];
		boolean estVendeur = controlLibererEtal.isVendeur(nomVendeur);
		if (!estVendeur) {
			System.out.println("Mais vous n etes pas inscrit sur notre marche aujourd'hui.");
		}
		else {
			donneesEtals = controlLibererEtal.libererEtal(nomVendeur);
			if (donneesEtals[0] == "1") {
			System.out.println("Vous avez vendu " +
			donneesEtals[4] + " \n sur " + donneesEtals[3] + donneesEtals[2]);
			}
		}
	}

}
