import java.io.IOException;
import java.util.Scanner;


public class Main {

	static Annuaire a = new Annuaire();
	
	public static void affiche(Object o) {
		System.out.println(o);
	}
	
	public static String readString() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		return s;
	}

	public static int readInt() {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		return i;
	}
	
	public static void afficherAnnuaire() {
		a.afficher();
	}
	
	public static void ajouterContact() {
		String n, sn;
		affiche("Prénom ?");
		n = readString();
		System.out.println("Nom ?");
		sn = readString();
		affiche("Numéro ?");
		NumeroDeTelephone num;
		try {
			num = NumeroDeTelephone.saisirNumero();
			a.ajouter(new Personne(sn, n), num);
			affiche("Contact ajouté.");
		} catch (IOException e) {
			affiche("Erreur.");
			e.printStackTrace();
		}
	}
	
	public static void chercherParNom() {
		String n, sn;
		affiche("Nom ?");
		sn = readString();
		affiche("Prénom ?");
		n = readString();
		Personne p = new Personne(sn,n);
		if (a.chercher(p) == null)
			affiche("Contact introuvable.");
		else
			affiche(p + " : " + a.chercher(p));
	}
	
	public static void chercherParNumero() {
		NumeroDeTelephone num;
		try {
			num = NumeroDeTelephone.saisirNumero();
			affiche(a.chercher(num));
		} catch (IOException e) {
			affiche("Erreur.");
			e.printStackTrace();
		}
	}
	
	public static void modifierContact() {
		String n, sn;
		affiche("Prénom ?");
		n = readString();
		affiche("Nom ?");
		sn = readString();
		Personne p = new Personne(sn, n);
		if (a.chercher(p) != null) {
			affiche("Nouveau numéro ?");
			NumeroDeTelephone num;
			try {
				num = NumeroDeTelephone.saisirNumero();
				a.modifierTel(p, num);
				affiche("Contact modifié.");
			} catch (IOException e) {
				affiche("Erreur.");
				e.printStackTrace();
			}
		} else {
			affiche("Contact introuvable");
		}
	}
	
	public static void sauvegarderAnnuaire(){
	}
	
	public static void main(String[] args) {
		boolean b = true;
		while (b) {
			affiche("----------- Annuaire -----------\nFaites votre choix :\n1. Recherche par nom\n2. Recherche par numéro\n3. Ajouter un contact\n4. Modifier un contact \n5. Afficher l'annuaire\n6. Sauvegarder l'annuaire");
			int i = readInt();
			switch(i) {
				case 1:
					chercherParNom();
					break;
				case 2:
					chercherParNumero();
					break;
				case 3:
					ajouterContact();
					break;
				case 4:
					modifierContact();
					break;
				case 5:
					afficherAnnuaire();
					break;
				case 6:
					sauvegarderAnnuaire();
					break;
				default:
					affiche("----------- Annuaire -----------\nFaites votre choix :\n1. Recherche par nom\n2. Recherche par numéro\n3. Ajouter un contact\n4. Modifier un contact \n5. Afficher l'annuaire\n6. Sauvegarder l'annuaire");
			}
		}
	}

}
