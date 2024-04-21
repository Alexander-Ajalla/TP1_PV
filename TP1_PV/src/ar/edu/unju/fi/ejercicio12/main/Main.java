package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese los datos de la persona: ");
		
		System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Fecha de nacimiento (formato dd/mm/yyyy): ");
        String fechaNacimientoStr = scanner.nextLine();
        
        String[] fechaParts = fechaNacimientoStr.split("/");
        int day = Integer.parseInt(fechaParts[0]);
        int month = Integer.parseInt(fechaParts[1]) - 1;
        int year = Integer.parseInt(fechaParts[2]);
        
        Calendar fechaNacimiento = Calendar.getInstance();
        fechaNacimiento.set(year, month, day);
        
        Persona persona = new Persona(nombre, fechaNacimiento);
        persona.mostrarDatos();
        System.out.println("----------"); 
        scanner.close();
	}

}
