package arrayenteros;

public class TestArrayIntInsercionEliminacion 
{
	public static void main(String args[])
	{
		//Creamos un objeto
		ArrayEnteros array = new ArrayEnteros();
		
		//Introducimos datos en el array
		array.leerArray();
		
		//Enviamos a pantalla el contaenido del array
		array.verArray();
		
		//Insertamos un dato
		array.insertar(8);
		
		array.verArray();
		array.eliminar();
		array.verArray();
	}	
		
		
		
}
