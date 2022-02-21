package arrays.unidimensionales;

/*
 * Durante la ejecuci�n del programa tambi�n puede producirse el acceso a un
 *  elemento fuera de los �ndices, y provocar� que el programa se �rompa� 
 *  en tiempo de ejecuci�n, generando una excepci�n.
 * */

public class VerificacionDeIndices {
	
public static void main(String[] args) {
	
	
	int arrayNumeros[] = new int[20];
	
	int numero = 2;
	
	for( int i=0; i<20; i++) {
		
		//Condici�n de Verificaci�n 
		if( i < arrayNumeros.length) {
			
			arrayNumeros[i] = numero;
			
			numero = numero + 1;
			
			System.out.println(arrayNumeros[i]);
			
		}else {
			
			return;
		}
		
	}
	
}

}
