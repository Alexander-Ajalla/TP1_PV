package ar.edu.unju.fi.ejercicio17.model;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Jugador {
	private String nombre;
	private String apellido;
	private Calendar fechaDeNacimiento;
	private String nacionalidad;
	private Integer estatura;
	private Integer peso;
	private String posicion;
	
	public Jugador () {}

	public Jugador(String nombre, String apellido, Calendar fechaDeNacimiento, String nacionalidad, Integer estatura,
			Integer peso, String posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		String fechaDeNacimientoStr = formato.format(this.getFechaDeNacimiento().getTime());
		return "Jugador [Nombre=" + nombre + ", Edad="+ calcularEdad() + " años" + ", Apellido=" + apellido + ", Fecha de Nacimiento=" + fechaDeNacimientoStr
				+ ", Nacionalidad=" + nacionalidad + ", Estatura=" + estatura + "cm" + ", Peso=" + peso + "kg" + ", Posicion="
				+ posicion + "]";
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
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Calendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Integer getEstatura() {
		return estatura;
	}

	public void setEstatura(Integer estatura) {
		this.estatura = estatura;
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
}