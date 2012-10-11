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
	
	public String toString(){
		return numero;
	}

	public static String saisirNumero() throws IOException{
		String ligne;
		boolean isCorrect = false;
		InputStreamReader isr = new InputStreamReader(new BufferedInputStream(System.in));
		BufferedReader br = new BufferedReader(isr, 14);
		while( ((ligne = br.readLine()) != null) && isCorrect){
			
		}
		
		br.close();
		return ligne;
	}
	
	public static boolean checkSyntax() {
		Pattern p = Pattern.compile("([0-9]{2}\\.){4}[0-9]{2}");
		Matcher m = p.matcher("0125485965");
		boolean b = m.matches();
		System.out.println(b);
		Matcher m1 = p.matcher("01.25.48.59.65");
		boolean b2 = m1.matches();
		System.out.println(b2);
		
		return b;
	}
}
