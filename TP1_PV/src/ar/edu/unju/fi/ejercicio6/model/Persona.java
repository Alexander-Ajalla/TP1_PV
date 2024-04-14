package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;
import java.time.Period;

	public class Persona{
		private Integer dni;
		private String nombre;
		private String provincia;
		private LocalDate fecNacimiento;
		
		public Persona() {}
		
		public int calcularEdad() {
			LocalDate fecActual = LocalDate.now();
			int edad = fecActual.getYear() - this.getFecNacimiento().getYear();
			//Period edad = Period.between(fecActual, this.fecNacimiento);
			//System.out.println("Edad"+edad);
			//Validación por dia para verificar que cumplio años
			if (fecActual.getMonthValue() < fecNacimiento.getMonthValue() ||
				    (fecActual.getMonthValue() == fecNacimiento.getMonthValue() &&
				     fecActual.getDayOfMonth() < fecNacimiento.getDayOfMonth())) {
				        edad--;
				  }
			return edad;
		}
		public Boolean mayorEdad() {
			return calcularEdad() >= 18;
		}
		
		public void mostrarDatos() {
			String esMayorEdad;
			if(mayorEdad()) {
				esMayorEdad = "Es mayor de edad";
			}else {
				esMayorEdad = "No es mayor de edad";
			}
			System.out.println("---Datos de la persona---");
			System.out.println("\nDNI: " + this.getDni() + " | " + "\nNombre: " + this.getNombre() + " | " + "\nFecha de Nacimiento: " + this.getFecNacimiento() 
			+ " | " + "\nProvincia: " + this.getProvincia() + " | " + "\nEdad: " + calcularEdad() + " | " + esMayorEdad); 
		}
	
		public Persona(Integer dni, String nombre, String provincia, LocalDate fecNacimiento) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.provincia = provincia;
			this.fecNacimiento = fecNacimiento;
		}
		public Integer getDni() {
			return dni;
		}
		public void setDni(Integer dni) {
			this.dni = dni;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public LocalDate getFecNacimiento() {
			return fecNacimiento;
		}
		public void setFecNacimiento(LocalDate fecNacimiento) {
			this.fecNacimiento = fecNacimiento;
		}
		public String getProvincia() {
			return provincia;
		}
		public void setProvincia(String provincia) {
			this.provincia = "Jujuy";
		}
		
		
	
	
	
}

