package ar.edu.unju.fi.ejercicio11;

public class Main {

	public static void main(String[] args) {
		int i = 2, j;
		boolean band = true;
		int valor = 0;
		int desc = 1;
		
		for(j = 40; j >= 0; j--) {
			if(band) {
				valor = j * i;
				band = false;
				desc += i; 
			} else {
				//Agregue un salto de linea de modo que sea más legible para cualquiera que lo lea.
				//si reemplazamos el \n por un espacio " ", se mostrarían todos los numeros seguidos.
				//El resultado sería basicamente el mismo, en cuanto a números, solo cambia la forma de visualizarlo.
				System.out.print(valor + "\n");
				//System.out.println(valor + " ");
				valor += (40 - desc);
				desc += i;
			}
		}
	}

}
