package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese los datos para la pizza " + i + ":");
            System.out.print("Diamentro: ");
            double diametro = scanner.nextDouble();  
            System.out.print("Ingredientes Especiales: ");
            boolean ingredientesEspeciales = scanner.nextBoolean();
            Pizza pizza = new Pizza(diametro,ingredientesEspeciales);
            pizza.mostrarDatos();
            System.out.println("----------");
        }
        scanner.close();
	}
}
