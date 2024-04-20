package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.text.SimpleAttributeSet;

public class Persona {
	private String nombre;
	private Calendar fechaDeNacimiento;
	
	public Persona () {}
	
	public Persona(String nombre, Calendar fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int calcularEdad () {
		 Calendar fechaActual = Calendar.getInstance();
		 int edad = fechaActual.get(Calendar.YEAR) - this.getFechaDeNacimiento().get(Calendar.YEAR);
		 if (fechaActual.get(Calendar.MONTH) < fechaDeNacimiento.get(Calendar.MONTH) ||
		    (fechaActual.get(Calendar.MONTH) == fechaDeNacimiento.get(Calendar.MONTH) &&
		     fechaActual.get(Calendar.DAY_OF_MONTH) < fechaDeNacimiento.get(Calendar.DAY_OF_MONTH))) {
		        edad--;
		  }
		 return edad;   
	}
	
	public String calcularEstacion (int month) {
		 switch (month) {
        	case Calendar.DECEMBER:
        	case Calendar.JANUARY:
        	case Calendar.FEBRUARY:
        		return "Verano";
        	case Calendar.MARCH:
        	case Calendar.APRIL:
        	case Calendar.MAY:
        		return "Otoño";
        	case Calendar.JUNE:
        	case Calendar.JULY:
        	case Calendar.AUGUST:
        		return "Invierno";
        	case Calendar.SEPTEMBER:
        	case Calendar.OCTOBER:
        	case Calendar.NOVEMBER:
        		return "Primavera";
        	default:
        		return "Estación no válida";
		}
	}
	
	public String calcularSignoZodiacal (int month, int day) {
		switch (month) {
		case 0: {
			return day >= 20 ? "Acuario": "Capricornio";
			}
		case 1: {
			return day >= 20 ? "Piscis": "Acuario";
			}
		case 2: {
			return day >= 20 ? "Aries": "Piscis";
			}
		case 3: {
			return day >= 20 ? "Tauro": "Aries";
			}
		case 4: {
			return day >= 20 ? "Géminis": "Tauro";
			}
		case 5: {
			return day >= 20 ? "Cáncer": "Géminis";
			}
		case 6: {
			return day >= 20 ? "Leo": "Cáncer";
			}
		case 7: {
			return day >= 20 ? "Virgo": "Leo";
			}
		case 8: {
			return day >= 20 ? "Libra": "Virgo";
			}
		case 9: {
			return day >= 20 ? "Escorpio": "Libra";
			}
		case 10: {
			return day >= 20 ? "Sagitario": "Escorpio";
			}
		case 11: {
			return day >= 20 ? "Capricornio": "Sagitario";
			}
		default: {return "No válido";}	
		}
	}
	
	public void mostrarDatos () {
		SimpleDateFormat formato = new SimpleAttributeSet("dd/MM/yyyy");
		int month = this.getFechaDeNacimiento().get(Calendar.MONTH);
		System.out.println("----------: " + month);
		int day = this.getFechaDeNacimiento().get(Calendar.DAY_OF_MONTH);
		
		String fechaNacimientoStr = formato.format(this.getFechaDeNacimiento().getTime());
		System.out.println("Nombre: " + this.getNombre() + "\n" + "Fecha de Nacimiento: "+ fechaNacimientoStr 
		+  "\n" + "Edad: " + calcularEdad() + " años" + "\n" + "Signo del zodiaco: " + calcularSignoZodiacal(month,day) + "\n" 
		+ "Estación: " + calcularEstacion(month));
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
}
