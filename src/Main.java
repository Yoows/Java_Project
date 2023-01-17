import exceptions.AgeSaisiException;
import models.Etudiant;

public class Main {

	public static void main(String[] args) throws AgeSaisiException {
		Etudiant etudiant = new Etudiant("Ivan", "Yossanguem", 'M', 17, 1011, "MASTER ISI");
		etudiant.sePresenter();
		try {
			etudiant.setAge(-1);
		} catch (AgeSaisiException e) {
			System.out.println(e.getMessage());
		}	
	}
}
