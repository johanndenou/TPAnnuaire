import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroDeTelephone {
	public String numero;
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
	 * Permet la saisie d'un nouveau numero de telephone
	 * 
	 * @return num le numero saisi
	 * @throws IOException
	 */
	public static NumeroDeTelephone saisirNumero() throws IOException {
		String num;
		boolean isCorrect = false;
		InputStreamReader isr = new InputStreamReader(new BufferedInputStream(
				System.in));
		BufferedReader br = new BufferedReader(isr, 14);
		System.out.println("Saisissez le numero de tel (01.23.45.67.89) : ");
		while (((num = br.readLine()) != null) && !isCorrect) {
			if (checkSyntax(p, num))
				isCorrect = true;
			else
				System.out.println("Mauvais numero, indiquez un bon numero : ");
		}
		return new NumeroDeTelephone(num);
	}

	/*
	 * Verifie qu'un numero est correct
	 * 
	 * @param p la regex
	 * @param num le numero
	 */
	public static boolean checkSyntax(Pattern p, String num) {
		Matcher m = p.matcher(num);
		return m.matches();
	}
}
