package ar.edu.unju.fi.ejercicio6.main;
import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su DNI: ");
		Integer dni = scanner.nextInt();
		
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Ingrese su provincia: ");
		String provincia = scanner.next();
		
		System.out.print("Fecha de nacimiento (formato AAAA-MM-DD): ");
        String fecNacimientoStr = scanner.next();
        LocalDate fecNacimiento = LocalDate.parse(fecNacimientoStr);
		
       // personita.calcularEdad();
		//personita.mayorEdad();
        Persona personita = new Persona(dni,nombre,provincia,fecNacimiento);
        personita.mostrarDatos();
		
	}
	
}
