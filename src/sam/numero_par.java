package sam;

import java.util.Scanner;

public class Numero_par {

	public static void main(String[] args) {
		//Dado el numero 234 Mostrar por la salida si dicho número es o no par.
			int numero;
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese número: ");
	numero=sc.nextInt();
	System.out.println("---------------------");
	if(numero%2==0) {
		System.out.println("Es par");
	}else {
	System.out.println("Es impar");}
	}

}
