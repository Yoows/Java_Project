import models.Etudiant;

public class Main {
	
	public static void main(String[] args) {
		test_runtime_exception(args);
	}
	
	public static void test_runtime_exception(String[] args) {
		Etudiant etudiant = new Etudiant(null, "Tss", 'M');
		try {
			etudiant.setAge(10);
		} catch (Exception e) {
			e.getMessage();
		}
		etudiant.setMatricule(1011);
		etudiant.setFormation("Master ISI");
		etudiant.sePresenter();
		
		
		
		
	}
	public static void test_exception(String[] args) {
		try {
			Etudiant etudiant = new Etudiant("Ivan", "Tss", 'M',-3, 1011, "MASTER ISI");
			etudiant.sePresenter();
		} catch (Exception e) {
			System.err.println(e.getMessage());;
		}
		
		
	}
}
