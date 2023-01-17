import models.Etudiant;

public class Main {

	public static void main(String[] args) {
		Etudiant etudiant = null ;
		int [] myArray = { 10, 20, 30 } ; 
		try {
			etudiant.sePresenter();
		}catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println(myArray[10]);
		}catch (NullPointerException e) {
			System.err.println(e.getMessage());
		}
		
		
		
	
		
	}

}
