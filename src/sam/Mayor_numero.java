package sam;

import java.util.Scanner;

public class Mayor_numero {
	public static void main(String[] args) {
	//Dado los n�meros 56, 34, 120  Mostrar el mayor de ellos.
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese 1� n�mero: ");
		int n1=sc.nextInt();
		System.out.println("Ingrese 2� n�mero: ");
		int n2=sc.nextInt();
		System.out.println("Ingrese 3� n�mero: ");
		int n3=sc.nextInt();
	if(n1>n2 && n1>n3) {
		System.out.println("El mayor es "+n1);
	}
	else if(n2>n1 && n2>n3) {
		System.out.println("El mayor es "+n2);
	}
	else if(n3>n1 && n3>n2) {
		System.out.println("-------------------");
		System.out.println("El mayor es "+n3);
	}
		
		
	}
}
