package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese un nombre: ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("---->Valores del Arreglo<----");
        for (String nombre : nombres) {
        
            System.out.println(nombre);
        }
        System.out.println("Longitud del arreglo: " + nombres.length);
        
        //Solicitar indice para borrar elemento
        byte borrarIndice;
        do {
            System.out.print("Ingrese un indice para borrar un elemento entre (0-" + (nombres.length - 1) + "): ");
            borrarIndice = scanner.nextByte();
        } while (borrarIndice < 0 || borrarIndice >= nombres.length);

        // Borrar elemento del array //
        for (int i = borrarIndice; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = "";
        
        System.out.println("---->Nuevo arreglo<----");
        for (String nombre : nombres) {
            if (!nombre.isEmpty()) {
                System.out.println(nombre);
            }
        }
        scanner.close();
	}

}
