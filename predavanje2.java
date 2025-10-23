package vjezba1;

import java.util.Scanner;

public class predavanje2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String text = "danas je lijep dan.";
		String tekst = sc.nextLine().trim();
		String okrenutTekst = new StringBuilder(tekst).reverse().toString();
		System.out.print(tekst.equalsIgnoreCase(okrenutTekst));
	}

}
