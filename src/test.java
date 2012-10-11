import java.io.IOException;


public class test {

	public static void main(String[] args) {
		Annuaire a = new Annuaire();
		
		Personne p = new Personne("Jean", "Dupont");
		Personne p1 = new Personne("Patrick", "Tartempion");
		Personne p2 = new Personne("Pierre", "Chirac");
		Personne p3 = new Personne("Claude", "Hollande");
		Personne p4 = new Personne("Marie", "Dupond");
		NumeroDeTelephone  n = new NumeroDeTelephone("0658947521");
		NumeroDeTelephone n1 = new NumeroDeTelephone("0524545656");
		NumeroDeTelephone n2 = new NumeroDeTelephone("0568787887");
		NumeroDeTelephone n3 = new NumeroDeTelephone("0998543354");
		NumeroDeTelephone n4 = new NumeroDeTelephone("0546785135");
		
		a.ajouter(p,n);
		a.ajouter(p1,n1);
		a.ajouter(p2,n2);
		a.ajouter(p3,n3);
		a.ajouter(p4,n4);
		
		a.afficher();
		
		try {
			NumeroDeTelephone.saisirNumero();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
