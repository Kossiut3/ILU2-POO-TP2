package frontiere;

import controleur.ControlEmmenager;

public class BoundaryEmmenager {
	private ControlEmmenager controlEmmenager;

	public BoundaryEmmenager(ControlEmmenager controlEmmenager) {
		this.controlEmmenager = controlEmmenager;
	}

	public void emmenager(String nomVisiteur) {
		if (controlEmmenager.isHabitant(nomVisiteur)) {
			System.out.println(
					"Mais vous êtes déjà un habitant du village !");
		} else {
			StringBuilder question = new StringBuilder();
			question.append("Êtes-vous :\n");
			question.append("1 - un druide.\n");
			question.append("2 - un gaulois.\n");
			int choixUtilisateur = -1;
			do {
				choixUtilisateur = Clavier.entrerEntier(question.toString());
				switch (choixUtilisateur) {
				case 1:
					emmenagerDruide(nomVisiteur);
					break;

				case 2:
					emmenagerGaulois(nomVisiteur);
					break;

				default:
					System.out
							.println("Vous devez choisir le chiffre 1 ou 2 !");
					break;
				}
			} while (choixUtilisateur != 1 && choixUtilisateur != 2);
		}
	}

	private void emmenagerDruide(String nomVisiteur) {
		StringBuilder question = new StringBuilder();
		StringBuilder questionPotionMax = new StringBuilder();
		StringBuilder questionPotionMin = new StringBuilder();
		
		int potionMax, potionMin;
		questionPotionMax.append("Quelle est la force de potion la plus forte que vous produisez:\n");
		questionPotionMin.append("Quelle est la force de potion la plus faible que vous produisez\n");
		
		question.append("Bienvenu Druide "+ nomVisiteur + "\n");
		question.append("Quel est votre force ??\n : ");
		int choixUtilisateur = Clavier.entrerEntier(question.toString());
		do {
			 potionMax = Clavier.entrerEntier(questionPotionMax.toString());
			 potionMin = Clavier.entrerEntier(questionPotionMin.toString());
			 if (potionMax < potionMin) {
				 System.out.println("Attention Druide, vous vous etes trompe entre le maximun et le minimun \n");
			 }
		}while(potionMax < potionMin);
		
		controlEmmenager.ajouterDruide(nomVisiteur, choixUtilisateur, potionMin, potionMax);
		
		
	}
	
	
	private void emmenagerGaulois(String nomVisiteur) {
		StringBuilder question = new StringBuilder();
		question.append("Bienvenu villageois "+ nomVisiteur + "\n");
		question.append("Quel est votre force\n");
		int choixUtilisateur = Clavier.entrerEntier(question.toString());
		controlEmmenager.ajouterGaulois(nomVisiteur, choixUtilisateur);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
