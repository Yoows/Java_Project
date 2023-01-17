package models;

import interfaces.Surveiller;

public class Surveillant extends Personne implements Surveiller {

	public Surveillant(String nom, String prenom, char sexe, int age) {
		super(nom, prenom, sexe, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void surveillerEvaluation() {
		// TODO Auto-generated method stub
		
	}

}
