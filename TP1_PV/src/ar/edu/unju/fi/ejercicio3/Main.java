package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero:");
		Integer num =scanner.nextInt();
		if(num / 2 == 0 ) {
			System.out.println("El numero "+ num +" es par");
		} else {
			System.out.println("El numero "+ num + " es impar");
		}
	}

}
