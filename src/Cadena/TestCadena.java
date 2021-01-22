package Cadena;

import java.io.IOException;

public class TestCadena {

	public static void main(String[] args) throws IOException
	{
		Cadena cadena1 = new Cadena(79);
		
		System.out.println("Introduce una cadena, pulsa enter para finalizar: ");
		
		cadena1.leerCadena();
		cadena1.escribirCadenaFor();
		System.out.println("la longitud de la cadena es: " + cadena1.longitud());
		cadena1.eliminarVocales();
		System.out.println("Imprimiendo cadena sin vocales");
		cadena1.escribirCadenaFor();
		Cadena cadena2 = new Cadena(79);
		System.out.println("Introduce otra cadena: ");
		cadena2.leerCadena();
		cadena2.escribirCadenaFor();
		if(cadena2.esPalindromo())
			System.out.println("La cadena es un palindromo");
		else
			System.out.println("La cadena no es un palindromo");
	}

}