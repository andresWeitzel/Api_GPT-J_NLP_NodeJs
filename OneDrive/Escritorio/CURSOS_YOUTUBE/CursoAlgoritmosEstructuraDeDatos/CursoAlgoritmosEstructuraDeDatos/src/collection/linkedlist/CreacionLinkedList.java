package collection.linkedlist;

import java.util.LinkedList;

public class CreacionLinkedList {
	
	public static void main(String args[]) {

		//https://www.geeksforgeeks.org/linked-list-in-java/
		
		//Una lista de tipo LinkedList es una estructura de datos lineal de tipo lista 
		//doblemente vinculada, cada objeto es separado con parte de datos y parte
		//de direccion en memoria, con punteros y direcciones
		//Las listas doblemente vinculadas poseen un puntero adicional
		
		/*
		 * ==== LINKEDLIST VS ARRAYLIST ====
		 - LO MALO DE LINKEDLIST
		 
		 Utiliza muchos objetos de memoria peque�os y, por lo tanto, afecta el 
		 rendimiento en todo el proceso.
		 
		Muchos objetos peque�os son malos para la localidad de cach�.
		
		Cualquier operaci�n indexada requiere un recorrido, es decir, tiene un
		 rendimiento O(n). Esto no es obvio en el c�digo fuente, lo que lleva a
		  algoritmos O(n) m�s lentos que si se usaran.ArrayList
		  
		Obtener un buen rendimiento es complicado.
		Incluso cuando el rendimiento de big-O es el mismo que , probablemente 
		ser� significativamente m�s lento de todos modos.ArrayList
		
	
		 * */
		
		//Como resumen este tipo de lista actua como una matriz dinamica
		
		LinkedList<String> lista = new LinkedList();
		
		lista.add("Marcela Perez");
		lista.add("Gustavo Castro");
		lista.add("Damian Bustamante");

		System.out.println(lista);
		
		lista.set(0, "Marcela Perez De Leon");
		
		System.out.println(lista);
	}
}
