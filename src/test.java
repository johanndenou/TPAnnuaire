
public class test {

	public static void main(String[] args) {
		Annuaire a = new Annuaire();
		
		Personne p = new Personne("Dupont", "Jean");
		Personne p1 = new Personne("Tartempion", "Patrick");
		Personne p2 = new Personne("Chirac", "Patrick");
		Personne p3 = new Personne("Hollande", "Claude");
		Personne p4 = new Personne("Dupont", "Marie");
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
		
		Personne p5 = new Personne("Isabelle","Adjani");
		NumeroDeTelephone numero1 = new NumeroDeTelephone("01.45.89.67.56");
		a.ajouter(p5, numero1);
		Personne p6 = new Personne("Isabelle","Adjani");
		System.out.println("p6 : " + a.chercher(p6));
		System.out.println("p5 : " + a.chercher(p5));
		System.out.println(p6.equals(p5));
		System.out.println(p6.hashCode());
		System.out.println(p5.hashCode());
	}

}
