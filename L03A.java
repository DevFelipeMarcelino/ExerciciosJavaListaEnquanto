package whilee;

import java.util.Scanner;

public class L03A {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int valor = sc.nextInt();
		int resultado;
		
		int contadora = 1;
		while (contadora <= 10) {
			resultado = valor * contadora;
			
			System.out.println(valor+ " * "+contadora+ " = "+resultado);
			contadora++;
			
			sc.close();
		}
	}

}
