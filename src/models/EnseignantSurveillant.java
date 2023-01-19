package models;


import interfaces.Surveiller;

public class EnseignantSurveillant extends Enseignant implements Surveiller {

	

	public EnseignantSurveillant(String nom, String prenom, char sexe, int age) throws Exception {
		super(nom, prenom, sexe, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surveillerEvaluation() {
		System.out.println("Je surveille les évaluations.");

	}

}
