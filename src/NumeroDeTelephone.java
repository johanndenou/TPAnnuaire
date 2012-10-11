import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumeroDeTelephone {
	public String numero;

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

	public static String saisirNumero() throws IOException {
		String ligne;
		boolean isCorrect = false;
		InputStreamReader isr = new InputStreamReader(new BufferedInputStream(
				System.in));
		BufferedReader br = new BufferedReader(isr, 14);
		Pattern p = Pattern.compile("([0-9]{2}\\.){4}[0-9]{2}");
		System.out.println("Saisissez le numéro de tel (01.23.45.67.89) : ");
		while (((ligne = br.readLine()) != null) && !isCorrect) {
			if (checkSyntax(p, ligne))
				isCorrect = true;
			else
				System.out.println("Mauvais numéro, indiquez un bon numéro : ");
		}

		br.close();
		return ligne;
	}

	public static boolean checkSyntax(Pattern p, String s) {
		Matcher m = p.matcher(s);
		return m.matches();
	}
}
