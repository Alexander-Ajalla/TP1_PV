package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero entre 0 y 10");
		Integer num = scanner.nextInt();
		
		int fact = 1;
		if(num >= 0 && num <= 10) {
			while(num > 0) {
				System.out.println(num);
				fact = fact * num;
				num--;
			} 
			System.out.println("Factorial: " + fact);
		} else {
			System.out.println("Numero fuera de rango");	
		}
	}

}
