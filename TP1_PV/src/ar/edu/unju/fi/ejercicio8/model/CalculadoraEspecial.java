package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private Integer n;
	
	public CalculadoraEspecial() {}

	public CalculadoraEspecial(Integer n) {
		super();
		this.n = n;
	}
	
	//Metodo sumatoria
	public Double calcularSumatoria() {
		double sumatoria = 0.0;
        for (int k = 1; k <= this.getN(); k++) {
            double termino = (k * (k + 1)) / 2;
            sumatoria += Math.pow(termino, 2);
        }
        return sumatoria;
	}
	
	//Metodo productoria
	public Double calcularProductoria() {
		double productoria = 1;
		 for (int k = 1; k <= n; k++) {
	            productoria *= (k * (k + 4));
	            }
		return productoria;
	}
	
	public Integer getN() {
		return n;
	}
	public void setN(Integer n) {
		this.n = n;
	}
}
