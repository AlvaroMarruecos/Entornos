package arrayenteros;

public class TestArrayEnteros {

	public static void main(String[] args)
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
	}

}
