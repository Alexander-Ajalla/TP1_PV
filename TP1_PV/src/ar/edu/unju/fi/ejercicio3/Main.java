package ar.edu.unju.fi.ejercicio3;

public class Main {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i es:" +i);
		}
		
		int num = 0;
		for(int i = 2; num < 20; num++) {
			System.out.println("Valor para numero: "+num);
			System.out.println("Valor para numero multiplicado por 2: "+num*i);
		}
		
		for(int i = 0, j=20, k=2;i < j; i++, k++) {
			System.out.println("Multiplicacion "+i+" x "+j+" = "+ i*j);
			System.out.println("Suma "+j + " + " + k+" = "+ (j+k));
		}
	}

}
