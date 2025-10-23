package vjezba1;

import java.util.Scanner;

public class predavanje4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String unos = sc.nextLine();
		String s = " ";
		for (int i=0;i<unos.length();i++) {
			char c = unos.charAt(i);
			
			int cifra = Character.getNumericValue(c);
			if (cifra%2==0) {
				s = s + '0';
			} else {
				s = s + '1';
				
			}
			System.out.println("Rezultat: " + s);
	        sc.close();
		}
		

	}

}
