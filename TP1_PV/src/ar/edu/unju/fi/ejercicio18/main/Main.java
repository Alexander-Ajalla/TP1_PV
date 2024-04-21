package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

		public class Main {
			private static Scanner scanner;
			private static List<Pais> paises;
			private static List<DestinoTuristico> destinosTuristicos;
			
			public static void main(String[] args) {
				scanner = new Scanner(System.in);
				destinosTuristicos = new ArrayList<>();
				precargarPaises();
				
				int option = 0;
				try {
					do {
						System.out.println("=======================");
						System.out.println("1 - Alta de destino turístico");
						System.out.println("2 - Mostrar todos los destinos turísticos");
						System.out.println("3 - Modificar el país de un destino turístico");
						System.out.println("4 - Limpiar arrayList de destino turísticos");
						System.out.println("5 - Eliminar un destino turístico");
						System.out.println("6 - Mostrar destinos turísticos ordenados por nombre");
						System.out.println("7 - Mostrar todos los países");
						System.out.println("8 - Mostrar destinos turísticos por país");
						System.out.println("9 - Salir");
						System.out.println("=======================");
						
						option = scanner.nextInt();
						scanner.nextLine();
						
						switch (option) {
						case 1: agregarDestino();
							break;
						case 2: mostrarDestinosTuristicos();
							break;
						case 3: modificarPais();
							break;
						case 4: mostrarDestinosTuristicos();
							break;
						case 5: eliminarUnDestinoTuristico();
							break;
						case 6: mostrarDestinosPorNombre();
							break;
						case 7: mostrarPaises();
							break;
						case 8: mostrarDestinosPorNombre();
							break;
						case 9: System.out.println("Fin del programa...");
							break;
						default:
							System.out.println("Opcion incorrecta");
							break;
						}
					} while(option != 9);
				} catch(InputMismatchException ex){
					System.out.println("Opcion no válida");
				}
			}
			private static void mostrarPaises() {

			}
			private static void eliminarUnDestinoTuristico() {

			}
			private static void mostrarDestinosTuristicos() {

			}
			private static void precargarPaises() {

			}
			public static void modificarPais () {
				System.out.print("Ingrese el código del destino turístico a modificar: ");
				String codigoDestino = scanner.next();
		        boolean destinoEncontrado = false;
		        
		        for (DestinoTuristico destino : destinosTuristicos) {
		            if (destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
		                System.out.print("Ingrese el nuevo código del país: ");
		                String nuevoCodigoPais = scanner.next();
		                for (Pais pais : paises) {
		                    if (pais.getCodigo().equalsIgnoreCase(nuevoCodigoPais)) {
		                        destino.setPais(pais);
		                        System.out.println("País modificado correctamente.");
		                        destinoEncontrado = true;
		                    }
		                }
		            }
		        }
		        if (!destinoEncontrado) {
		            System.out.println("El código de destino turístico ingresado no es válido.");
		        }
			}
			public static void agregarDestino () {
				DestinoTuristico destino = new DestinoTuristico();
				String codigoPais = "";
				Pais paisAsociado = null;
				
				do {
					System.out.println("Ingrese el código del país: ");
					codigoPais = scanner.next();
				
					for (Pais pais : paises) {
						if (pais.getCodigo().equalsIgnoreCase(codigoPais)) {
							paisAsociado = pais;
						}
					}
				} while(paisAsociado == null);
				
		        try {
		        	destino.setPais(paisAsociado);
		        	
		        	scanner.nextLine();
		            System.out.println("Ingrese el codigo del destino turistico: ");
		            destino.setCodigo(scanner.nextLine());
		            
		            System.out.println("Ingrese nombre del destino: ");
		            destino.setNombre(scanner.nextLine());
		            
		            System.out.println("Ingrese el precio: ");
		            destino.setPrecio(scanner.nextInt());
		                        
		            System.out.println("Ingrese la cantidad de dias: ");
		            destino.setCantDias(scanner.nextInt());
		            
		            
		            destinosTuristicos.add(destino);
		            
		            System.out.println("Se agregó un nuevo destino turistico...");
		        } catch (InputMismatchException ex) {
		        	System.out.println("Tipo de dato no válido");
		        }
			}
			public static void mostrarDestinosPorNombre () {
				if(destinosTuristicos.isEmpty()) {
					System.out.println("--------------- Lista vacia --------------");
				} else {
					System.out.println("--------- Lista de Destinos turisticos por nombre ----------");
					destinosTuristicos.sort(Comparator.comparing(DestinoTuristico::getNombre));
					destinosTuristicos.forEach(destino -> System.out.println(destino));
				}
			}
			public static void eliminarDestinosTuristicos() {
				destinosTuristicos.clear();
				System.out.println("Lista de destinos turisticos eliminada...");
			}
			public static void eliminarUnDestinoTuristico() {
				System.out.println("Ingrese el codigo del destino a eliminar: ");
				String codigoDestino = scanner.next();
				Boolean destinoEncontrado = false;
				
				Iterator<DestinoTuristico> iterator = destinosTuristicos.iterator();	
				while(iterator.hasNext()) {
					DestinoTuristico destino = iterator.next();
					if(destino.getCodigo().equalsIgnoreCase(codigoDestino)) {
						destinoEncontrado = true;
					  	iterator.remove();
						mostrarDestinosTuristicos();
						System.out.println("------------------");
						System.out.println("Se eliminó el destino con el codigo: "+ codigoDestino);
					}
				}
				if(!destinoEncontrado) {
					System.out.println("No se encontró el destino...");
				}
			}
			public static void mostrarDestinosTuristicos() {
				if(destinosTuristicos.isEmpty()) {
					System.out.println("----------- Lista Vacia -----------");
				} else {
					System.out.println("----------- Destinos Turisticos ------------");			
					destinosTuristicos.forEach(destino -> System.out.println(destino));
				}
			}
			public static void precargarPaises () {
				if(paises == null) {
					paises = new ArrayList<>();
				}
				paises.add(new Pais("ARG", "Argentina"));
				paises.add(new Pais("BOL", "Bolivia"));
				paises.add(new Pais("CHL", "Chile"));	
			}
			public static void mostrarPaises() {
				System.out.println("--------- Lista de Paises ----------");
				paises.forEach(pais -> System.out.println(pais));
			}
			public static void mostrarDestinosPorPais () {
				if (destinosTuristicos.isEmpty()) {
				    System.out.println("Lista vacía...");
				} else {
				    boolean paisEncontrado = false;
				    do {
				        System.out.println("Ingrese el código de un país: ");
				        String pais = scanner.next();
				        Iterator<DestinoTuristico> iterator = destinosTuristicos.iterator();
				        System.out.println("--------- Lista de Destinos Turísticos por Pais ----------");
				        while (iterator.hasNext()) {
				            DestinoTuristico destino = iterator.next();
				            if (destino.getPais().getCodigo().equalsIgnoreCase(pais)) {
				                System.out.println(destino);
				                paisEncontrado = true;
				            }
				        }
				        if (!paisEncontrado) {
				            System.out.println("El país ingresado no se encuentra en la lista. Intente nuevamente.");
				        }
				    } while (!paisEncontrado);
				}
			}
		}
	}

}
