package ar.edu.unju.fi.ejercicio2;

public class Main {

	public static void main(String[] args) {
		String pais;
		Integer edad, numTel;
		Double altura, precio, coseno;
		
		pais = "Argentina ★★★";
		edad= 20;
		numTel = 388404777;
		altura = 40.5;
		precio = 5.99;
		coseno = Math.cos(0.5);
		
		System.out.println("---EJERCICIO 2---");
		System.out.println("Pais: " + pais);
		System.out.println("Edad: "+edad);
		System.out.println("Nro telefono: " + numTel);
		System.out.println("Altura: "+altura+"m");
		System.out.println("Precio: $"+precio);
		System.out.println("Coseno de 0.5: "+coseno);
	}

}
