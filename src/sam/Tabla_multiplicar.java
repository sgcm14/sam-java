package sam;

import java.util.Scanner;

public class Tabla_multiplicar {

	public static void main(String[] args) {
		// 3.	Mostrar su tabla de multiplicar del numero 5.
		int numero=0;
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Ingrese el número: ");
		numero=sc.nextInt();
		
	
		for (int i=1; i<=10;i++) {
		System.out.println(numero +" * "+i+ " = "+ numero*i);
		}
			
		
	}

}
