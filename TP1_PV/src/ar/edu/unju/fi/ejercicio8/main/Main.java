package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		Integer n = scanner.nextInt();
		
		CalculadoraEspecial calculadora = new CalculadoraEspecial(n);
		System.out.println("Calculando...");
		System.out.println("Sumatoria: "+ calculadora.calcularSumatoria());
		System.out.println("Productoria: " + calculadora.calcularProductoria());
		
		scanner.close();
		}

}
