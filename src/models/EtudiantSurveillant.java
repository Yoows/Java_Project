package models;

import interfaces.Surveiller;

public class EtudiantSurveillant extends Etudiant implements Surveiller {

	

	public EtudiantSurveillant(String nom, String prenom, char sexe, int age, int matricule, String formation) throws Exception {
		super(nom, prenom, sexe, age, matricule, formation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surveillerEvaluation() {
		// TODO Auto-generated method stub

	}

}
