import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroDeTelephone implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String numero;
	private static Pattern p = Pattern.compile("([0-9]{2}\\.){4}[0-9]{2}");
	
	public NumeroDeTelephone(String numero) {
		super();
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String toString() {
		return numero;
	}

	/*
	 * Permet la saisie d'un nouveau numéro de téléphone
	 * 
	 * @return num le numéro saisi
	 * @throws IOException
	 */
	public static NumeroDeTelephone saisirNumero() throws IOException {
		String num = null;
		boolean isCorrect = false;
		InputStreamReader isr = new InputStreamReader(new BufferedInputStream(
				System.in));
		BufferedReader br = new BufferedReader(isr, 14);
		System.out.println("Saisissez le numéro au format 01.23.45.67.89 : ");
		while (!isCorrect && ((num = br.readLine()) != null)) {
			if (checkSyntax(p, num)){
				isCorrect = true;
			} else {
				System.out.println("Mauvais numéro, indiquez un bon numéro au format 01.23.45.67.89 : ");
			}
		}
		return new NumeroDeTelephone(num);
	}

	/*
	 * Verifie qu'un numéro est correct
	 * 
	 * @param p la regex
	 * @param num le numéro
	 */
	public static boolean checkSyntax(Pattern p, String num) {
		Matcher m = p.matcher(num);
		return m.matches();
	}
}
