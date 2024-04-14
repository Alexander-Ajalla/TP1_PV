package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private Double salario;
	
	private static final Double SALARIO_MINIMO = 210.000;
	private static final Double AUMENTO_SALARIO = 20.000;
	
	public Empleado() {}
	public Empleado(String nombre, Integer legajo, Double salario) {
		super();
		this.nombre = nombre;
		this.legajo = legajo;
		if(salario >= SALARIO_MINIMO) {
			this.salario = salario; 
		} else {
			//System.out.println("El salario es muy bajo, asignando salario minimo");
			this.salario = SALARIO_MINIMO;
		}
	}
	
	public void darAumento() {
		this.salario = salario + AUMENTO_SALARIO;
	}
	
	public void mostrarDatos() {
		System.out.println("---Informacion del empleado---");
		System.out.println("Nombre del empleado: " + this.getNombre() + "\nLegajo: "+ this.getLegajo() + "\nSalario: $"+ this.getSalario());
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	
	
}