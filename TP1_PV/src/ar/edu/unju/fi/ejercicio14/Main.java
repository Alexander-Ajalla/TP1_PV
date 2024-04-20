package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Ingrese un numero dentro del rango [3,10]");
			numero = scanner.nextInt();
		}while(!(numero >= 3 && numero <= 10));
		int[] myArray = new int[numero];
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Ingresa un numero: ");
			myArray[i] = scanner.nextInt();
		}
		int sumaTotal = 0;
		for(int i = 0; i < myArray.length; i++) {
			System.out.println("Indice: " + i + " | " + "Valor: " + myArray[i]);
			sumaTotal += myArray[i];
		}
		scanner.close();
		System.out.println("Suma total: " + sumaTotal);
	}

}
