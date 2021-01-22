package arrayenteros;

import java.util.Scanner;

public class TestArrayIntOrdenacionBusquedaBinaria {

	public static void main(String[] args)
	{
		//Creamos un objeto
		ArrayEnteros array = new ArrayEnteros();
		Scanner entrada = new Scanner(System.in);
		
		//Introducimos datos en el array
		array.leerArray();
		
		//Enviamos a pantalla el contaenido del array
		array.verArray();
		array.ordenacionBurbuja();
		System.out.println();
		array.verArray();
		System.out.println("Introduce elemento a buscar: ");
		int buscado = entrada.nextInt();
		int posicion = array.busquedaBinaria(buscado);
		boolean existe = (posicion != -1);
		if(existe)
			System.out.println(buscado + " está en la posición " + posicion);
		else
			System.out.println(buscado + " no está en el array");
		
		
	}

}
