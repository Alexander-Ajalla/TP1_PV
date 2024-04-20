package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] myArray = new int[8];
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Ingrese un numero: ");
			myArray[i] = scanner.nextInt();
		}
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Indice: " + i + " | " + "Valor: " + myArray[i]);					
		}
		scanner.close();
	}

}
