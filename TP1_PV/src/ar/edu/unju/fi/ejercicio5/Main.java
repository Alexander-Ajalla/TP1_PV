package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entre 1 y 9");
		Integer num = scanner.nextInt();
		int producto=0;
		if(num >= 1 && num <= 9) {
		for (int i = 0;i <= 10; i++) {
			producto = num * i;
			System.out.println(num + " * " + i + " = " + producto );
			}
		} else {
			System.out.println("ERROR - Numero fuera de rango");
		}
	
	}
}
