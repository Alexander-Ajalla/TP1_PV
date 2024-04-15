package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private Double diametro;
	private Integer precio;
	private Double area;
	
	private Boolean ingredientesEspeciales;
	private static final Integer ADICIONAL_20 = 500;
	private static final Integer ADICIONAL_30 = 750;
	private static final Integer ADICIONAL_40 = 1000;
	
	public Pizza() {}

	
	public Pizza(Double diametro, Boolean ingredientesEspeciales) {
		super();
		this.diametro = diametro;
		//this.precio = precio;
		//this.area = area;
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public void mostrarDatos () {
		System.out.println("Pizza [diametro=" + diametro + ", precio=$" + calcularPrecio() + ", area=" + calcularArea() + ", ingredientesEspeciales="
				+ ingredientesEspeciales + "]");
	}
	
	public double calcularArea () {
		double radio = diametro / 2.0;
        this.area = Math.PI * Math.pow(radio, 2);
        return this.area;
	}
	
	public double calcularPrecio () {
		if (this.getDiametro() == 20) {
            if (this.getIngredientesEspeciales()) {
                this.precio = 4500 + ADICIONAL_20;
            } else {
                this.precio = 4500;
            }
        } else if (this.getDiametro() == 30) {
            if (this.getIngredientesEspeciales()) {
                this.precio = 4800 + ADICIONAL_30;
            } else {
                this.precio = 4800;
            }
        } else if (this.getDiametro() == 40) {
            if (this.getIngredientesEspeciales()) {
                this.precio = 5500 + ADICIONAL_40;
            } else {
                this.precio = 5500;
            }
        } else {
        	return this.precio = 4500;
        }
		return this.precio;            
	}
	
	public Double getDiametro() {
		return diametro;
	}

	public void setDiametro(Double diametro) {
		this.diametro = diametro;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Boolean getIngredientesEspeciales() {
		return ingredientesEspeciales;
	}

	public void setIngredientesEspeciales(Boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	public static Integer getAdicional20() {
		return ADICIONAL_20;
	}

	public static Integer getAdicional30() {
		return ADICIONAL_30;
	}

	public static Integer getAdicional40() {
		return ADICIONAL_40;
	}
	
	
}
