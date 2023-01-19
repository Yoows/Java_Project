package models;

import interfaces.Enseigner;

public class EtudiantEnseignant extends Etudiant implements Enseigner {



	public EtudiantEnseignant(String nom, String prenom, char sexe, int age, int matricule, String formation) throws Exception {
		super(nom, prenom, sexe, age, matricule, formation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispenserCours() {
		// TODO Auto-generated method stub

	}

}
