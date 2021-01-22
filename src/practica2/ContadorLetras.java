package practica2;



import java.io.IOException;

public class ContadorLetras
{
	public static void main(String[] args) throws IOException 
	{
		int abc[] = new int ['z'-'a'+1];
		System.out.println("Introduce un texto (pulse enter y continuación Control d para terminar)");
		final char eof = (char) -1;
		
		char car = (char) System.in.read();
		
		while(car != eof)
		{
			//convertimo a minúscula
			car = Character.toLowerCase(car);
			//comprobamos si es una letra del abecedario	
			if(car >= 'a' && car <= 'z')
				abc[car-'a']++;
			car = (char) System.in.read();
		
		}
		System.out.println("\n\n");
		
		for(char letra = 'a'; letra <= 'z'; letra++)
		{
			System.out.print(letra + "  ");
		}
		
		System.out.println("\n");
		
		for(int i = 0; i < 'z'-'a'+1; i++)
		{
			System.out.print(abc[i]+"  ");
		}

	}

}