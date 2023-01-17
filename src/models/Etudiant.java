package models;

import exceptions.AgeSaisiException;

public class Etudiant extends Personne {
	private int matricule ; 
	private String formation; 
	

	public Etudiant(String nom, String prenom, char sexe, int age, int matricule, String formation) throws AgeSaisiException {
		super(nom, prenom, sexe, age);
		this.setMatricule(matricule);
		this.setFormation(formation); 	
	}


	public String getFormation() {
		return formation;
	}


	public void setFormation(String formation) {
		this.formation = formation;
	}


	public int getMatricule() {
		return matricule;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	@Override
	public void sePresenter() {
		super.sePresenter();
		System.out.println("Mon numero de matricule : "+matricule + " Ma formation :  " + formation ) ;
	}
	
	

}
