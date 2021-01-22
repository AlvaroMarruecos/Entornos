package arrayenteros;

public class TestArrayIntBusquedaSecuencial {
	public static void main(String args[]) {
		//Creamos un objeto
		ArrayEnteros array = new ArrayEnteros();
		
		//Introducimos datos en el array
		array.leerArray();
		
		//Enviamos a pantalla el contaenido del array
		array.verArray();
		
		System.out.println("Busqueda secuencial version 1");
		int buscado = 3;
		int posicion = array.busquedaSecuencial(buscado);
		boolean existe = (posicion != -1);
		if (existe)
		{
			System.out.println(buscado + " Esta en la posicion " + posicion);
		}else
		{
			System.out.println(buscado + " No esta en el array");
		}
		
		System.out.println("Busqueda secuencial version 2");
		buscado = 3;
		posicion = array.busquedaSecuencial2(buscado);
		existe = (posicion != -1);
		if (existe)
		{
			System.out.println(buscado + " Esta en la posicion " + posicion);
		}else
		{
			System.out.println(buscado + " No esta en el array");
		}
		
	}
}
