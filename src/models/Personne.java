package models;

import exceptions.AgeSaisiException;

public abstract class Personne {
	
	protected String nom ; 
	protected String prenom; 
	protected char sexe ; 
	protected int age ; 
	
	private static int nbPersonne;
	public void sePresenter() {
		System.out.println("Je m'appelle " + nom + " " + prenom + ", j'ai " + age + " ans " + "sexe : " + sexe) ;
	}
	
	
	
	public Personne(String nom, String prenom, char sexe, int age) throws AgeSaisiException {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		setAge(age);
		nbPersonne++;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public char getSexe() {
		return sexe;
	}



	public void setSexe(char sexe) {
		this.sexe = sexe;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) throws AgeSaisiException {
		if (age < 0) {
			throw new AgeSaisiException("Age non valide : age doit > 0.");
		}
		this.age = age > 0 ? age : this.age ; 
	}



	public static int getNbPersonnes() {
		return nbPersonne;
	}

}
