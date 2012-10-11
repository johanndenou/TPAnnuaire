import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Annuaire {
	private Map<Personne, NumeroDeTelephone> map;
	
	public Annuaire(){
		 map = new HashMap<Personne,NumeroDeTelephone>();
	}
	
	public void ajouter(Personne p, NumeroDeTelephone n) {
		map.put(p, n);
	}
	
	public void supprimer(Personne p) {
		map.remove(p);
	}
	
	public void modifierTel(Personne p, NumeroDeTelephone n) {
		map.remove(p);
		map.put(p,n);
	}
	
	public NumeroDeTelephone chercher(Personne p) {
		map.entrySet();
		return map.get(p);
	}
	
	public void afficher(){
		for(Entry<Personne, NumeroDeTelephone> entry : map.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
