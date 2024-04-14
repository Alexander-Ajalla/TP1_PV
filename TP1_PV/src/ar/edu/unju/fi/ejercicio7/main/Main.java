package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre del empleado: ");
		String nombre = scanner.nextLine();
		System.out.println("Ingrese legajo: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese salario:");
		Double salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado(nombre,legajo,salario);
		empleado.mostrarDatos();
		empleado.darAumento();
		System.out.println("Incluyendo aumento...");
		empleado.mostrarDatos();
		scanner.close();
	}

}