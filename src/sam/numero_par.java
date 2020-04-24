package sam;

import java.util.Scanner;

public class numero_par {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int numero;
	Scanner sc = new Scanner(System.in);
	System.out.println("Ingrese número");
	numero=sc.nextInt();
	
	if(numero%2==0) {
		System.out.println("Es par");
	}else {
	System.out.println("Es impar");}
	}

}
