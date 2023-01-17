package models;

import interfaces.Enseigner;

public class Enseignant extends Personne implements Enseigner {

	public Enseignant(String nom, String prenom, char sexe, int age) {
		super(nom, prenom, sexe, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispenserCours() {
		// TODO Auto-generated method stub
		
	}

}
