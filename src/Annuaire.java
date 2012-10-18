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
	 * Ajoute une personne et son numéro de téléphone
	 * 
	 * @param p la personne
	 * @param n le numéro
	 */
	public void ajouter(Personne p, NumeroDeTelephone n) {
		map.put(p, n);
	}
	
	/*
	 * Supprime une personne de l'annuaire
	 * 
	 * @param p la personne à supprimer
	 */
	public void supprimer(Personne p) {
		map.remove(p);
	}
	
	/*
	 * Modifie le téléphone d'une personne
	 * 
	 * @param p la personne
	 * @param n le nouveau numéro
	 */
	public void modifierTel(Personne p, NumeroDeTelephone n) {
		map.remove(p);
		map.put(p,n);
	}
	
	/*
	 * Retourne le numéro associé à la personne donnée.
	 * 
	 * @param p la personne
	 * @return le numéro de téléphone associé
	 */
	public NumeroDeTelephone chercher(Personne p) {
		return map.get(p);
	}
	
	/*
	 * Retourne la Personne correspondant au numero de téléphone donné
	 * 
	 * @param n le numéro de téléphone
	 * @return la personne associée au numéro, null si le numéro n'est pas présent dans l'annuaire
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
	 * Affiche le contenu de l'annuaire trié par ordre alphabétique
	 */
	public void afficher(){
		Set<Personne> set = new TreeSet<Personne>(map.keySet());
		for(Personne p : set){
			System.out.println(p + " : " + map.get(p));
		}
	}
}
