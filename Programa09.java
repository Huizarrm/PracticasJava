package programa8;

import java.util.Scanner;

public class Programa8 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Byte opc;
		double pulg=0, pies=0, ope=0;
		
		Scanner leer = new Scanner (System.in);
		System.out.println( "Opciones");
		System.out.println("1  Pies a Pulgadas");
		System.out.println("2  Pies a CM");
		System.out.println("3  Pies a Pulgadas");
		System.out.println("  ELIJE UNA OPCION");
		opc = leer.nextByte();
		
		switch (opc){
		case 1: System.out.println("Ingrese Pulgadas a convertir a pies");
		pulg=leer.nextFloat();
		ope = pulg*2.54;
		System.out.println("CM"+ope);
		case 2: System.out.println("Ingrese Pies a convertir a CM");
		pies=leer.nextFloat();
		ope = pies*30.48;
		System.out.println("CM"+ope);
		case 3: System.out.println("Ingrese Pies a convertir a pulgadas");
		pies=leer.nextFloat();
		ope =pies*12;
		System.out.println("Pulgadas"+ope);
		
		

		}
}
	}	
