package arrays.unidimensionales;


/*
 Se desea agregar un conjunto de N�meros Enteros consecutivos
del 0 al 100 dentro de un array.
 El requisito para agregar cierto conjunto de n�meros es hacerlo
 solamente por indice, de forma que en el ultimo indice del arreglo
 se encuentre el n�mero 100  y en la primera posicion el numero 0. 
  */


public class AgregarElementosEnterosPorIndice {
	
	public static void main(String[] args) {
		
		int arrayNumerosEnteros[] = new int[101];
		
		for(int i=0 ; i < 101; i++ ) {
			
			arrayNumerosEnteros[i] = i;
			
			System.out.println("Elementos del Array " + arrayNumerosEnteros[i]);
		}
		
		
		
	}

}
