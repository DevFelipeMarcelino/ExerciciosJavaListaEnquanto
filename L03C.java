package whilee;

import java.util.Scanner;

public class L03C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int resultado;
		
		int contadora = 1;
		System.out.println(contadora);
		
		while (contadora < 19) {
			resultado = contadora + 2;
			
			System.out.println(resultado);
			contadora = contadora + 2;
			
			sc.close();
		}
	}
}
