package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---BIENVENIDO---");
		for(int i = 1; i <= 3; i++) {
			System.out.println("Ingrese nombre el nombre del producto n° " + i );
			String nombre = scanner.next();
			scanner.nextLine();
			System.out.println("Ingrese el codigo del producto:");
			Integer codigo = scanner.nextInt();
			System.out.println("Ingrese el precio del producto:");
			Integer precio = scanner.nextInt();
			System.out.println("Descuento del proudcto");
			Integer descuento = scanner.nextInt();
			
			//crear el objeto
			Producto producto = new Producto(nombre,codigo,precio);
			producto.setDescuento(descuento);
			producto.mostrarDatos();
			System.out.println("------------");
		}
			
		}
	}


