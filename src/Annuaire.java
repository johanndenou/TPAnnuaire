import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Annuaire {
	private Map<Personne, NumeroDeTelephone> map;
	
	/*
	 * Constructeur vide.
	 */
	public Annuaire(){
		 map = new HashMap<Personne,NumeroDeTelephone>();
	}
	
	/*
	 * Ajoute une personne et son numero de telephone
	 * 
	 * @param p la personne
	 * @param n le numero
	 */
	public void ajouter(Personne p, NumeroDeTelephone n) {
		map.put(p, n);
	}
	
	/*
	 * Supprime une personne de l'annuaire
	 * 
	 * @param p la personne � supprimer
	 */
	public void supprimer(Personne p) {
		map.remove(p);
	}
	
	/*
	 * Modifie le telephone d'une personne
	 * 
	 * @param p la personne
	 * @param n le nouveau numero
	 */
	public void modifierTel(Personne p, NumeroDeTelephone n) {
		map.remove(p);
		map.put(p,n);
	}
	
	/*
	 * Retourne le numero associe � la personne donnee.
	 * 
	 * @param p la personne
	 * @return le numero de telephone associe
	 */
	public NumeroDeTelephone chercher(Personne p) {
		return map.get(p);
	}
	
	/*
	 * Retourne la Personne correspondant au numero de telephone donne
	 * 
	 * @param n le numero de telephone
	 * @return la personne associee au numero, null si le numero n'est pas present dans l'annuaire
	 */
	public Personne chercher(NumeroDeTelephone n) {
		Personne p = null;
		for(Entry<Personne, NumeroDeTelephone> entry : map.entrySet()){
			if (entry.getValue() == n)
				p = entry.getKey();
		}
		return p;
	}
	
	
	/*
	 * Affiche le contenu de l'annuaire trie par ordre alphabetique
	 */
	public void afficher(){
		Set<Personne> set = new TreeSet<Personne>(map.keySet());
		for(Personne p : set){
			System.out.println(p + " : " + map.get(p));
		}
	}
}
