package ar.edu.unju.fi.ejercicio17.main;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	private static Scanner scanner;
	private static List<Jugador> jugadores;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		jugadores = new ArrayList<>();
		int option = 0;
		try {
			do {
				System.out.println("-------------------------");
				System.out.println("1 - Alta de jugador");
				System.out.println("2 - Mostrar los datos del jugador");
				System.out.println("3 - Mostrar jugadores por apellido");
				System.out.println("4 - Modificar jugador");
				System.out.println("5 - Eliminar jugador");
				System.out.println("6 - Mostrar cantidad de Jugadores");
				System.out.println("7 - Mostrar jugadores por nacionalidad");
				System.out.println("8 - Salir");
				System.out.println("-------------------------");
				
				option = scanner.nextInt();
				scanner.nextLine();
				
				switch (option) {
				case 1: agregarJugador();
					break;
				case 2: mostrarDatosJugador();
					break;
				case 3: mostrarJugadoresPorApellido();;
					break;
				case 4: modificarJugador();
					break;
				case 5: eliminarJugador();
					break;
				case 6: System.out.println("Total de jugadores: " + jugadores.size());
					break;
				case 7: mostrarJugadoresNacionalidad();
					break;
				case 8: System.out.println("Fin del programa...");
					break;
				default:
					System.out.println("Opcion incorrecta");
					break;
				}
			} while(option !=8);
		} catch(InputMismatchException ex){
			System.out.println("Ingrese numeros");
			//Integer numeros = scanner.nextInt();
		}
	}
	
	public static void mostrarJugadoresPorApellido() {
		if(jugadores.isEmpty()) {
			System.out.println("Lista vacia...");
		} else {
			System.out.println("--------- Lista de jugadores por apellido ----------");
			jugadores.sort(Comparator.comparing(Jugador::getApellido));
			jugadores.forEach(player -> System.out.println(player));
		}
	}
	
	public static void agregarJugador() {
		Jugador jugador = new Jugador();
		Calendar fechaNacimiento = Calendar.getInstance();
		
		System.out.println("Ingrese el nombre del jugador: ");
		jugador.setNombre(scanner.nextLine());
		
		System.out.println("Ingrese el apellido del jugador: ");
		jugador.setApellido(scanner.nextLine());
		
		System.out.println("Ingrese la fecha de nacimiento del jugador (dd/mm/yyyy): ");
		String fechaNacimientoStr = scanner.nextLine();
        String[] fechaParts = fechaNacimientoStr.split("/");
        int day = Integer.parseInt(fechaParts[0]);
        int month = Integer.parseInt(fechaParts[1]) - 1;
        int year = Integer.parseInt(fechaParts[2]);
        fechaNacimiento.set(year, month, day);
        jugador.setFechaDeNacimiento(fechaNacimiento);
        
        System.out.println("Ingrese nacionalidad del jugador: ");
        jugador.setNacionalidad(scanner.nextLine());
        
        System.out.println("Ingrese estatura en"+ " cm "+"del jugador: ");
        jugador.setEstatura(scanner.nextInt());
        
        System.out.println("Ingrese peso del jugador: ");
        jugador.setPeso(scanner.nextInt());
        
        System.out.println("Ingrese posicion del jugador: ");
        jugador.setPosicion(scanner.next());
        
        jugadores.add(jugador);
        
        System.out.println("Se agregó un nuevo jugador...");
	}
	
	public static void mostrarJugadoresNacionalidad() {
		System.out.println("Ingrese una nacionalidad: ");
		String nacionalidadIngresada = scanner.next();
		int cantidad = 0;
		
		for (Jugador jugador : jugadores) {
            if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidadIngresada)) {
             cantidad++;   
            }
        }
		System.out.println("Cantidad de jugadores con nacionalidad "+ nacionalidadIngresada +": "+ cantidad);
	}
	
	public static Jugador mostrarDatosJugador() {
		System.out.println("Ingrese nombre del jugador: ");
		String nombre = scanner.next();
		System.out.println("Ingrese apellido del jugador: ");
		String apellido = scanner.next();
		
		Jugador player = null;
		boolean encontrado = false;
		
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) &&
                jugador.getApellido().equalsIgnoreCase(apellido)) {
                System.out.println("Jugador encontrado:");
                System.out.println(jugador);
                encontrado = true;
                player = jugador;
            }
             player = null;
        }
        if (!encontrado) {
            System.out.println("No se encontró ningún jugador con esos datos.");
        }
        return player;
	}
	
	public static void modificarJugador () {
		Jugador jugadorEncontrado = null;
		Calendar fechaNacimiento = Calendar.getInstance();
		System.out.println("Ingrese el nombre del jugador: ");
		String nombreModificar = scanner.next();
		
		System.out.println("Ingrese el apellido del jugador: ");
		String apellidoModificar = scanner.next();
		
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombreModificar) &&
                jugador.getApellido().equalsIgnoreCase(apellidoModificar)) {
                jugadorEncontrado = jugador;
                break;
            }
        }

        if (jugadorEncontrado != null) {
            System.out.print("Ingrese el nuevo nombre del jugador: ");
            jugadorEncontrado.setNombre(scanner.next());
            
            System.out.print("Ingrese el nuevo apellido del jugador: ");
            jugadorEncontrado.setApellido(scanner.next());
            scanner.nextLine();
            
            System.out.println("Ingrese la nueva fecha de nacimiento del jugador (dd/mm/yyyy): ");
    		String fechaNacimientoStr = scanner.next();
            String[] fechaParts = fechaNacimientoStr.split("/");
            int day = Integer.parseInt(fechaParts[0]);
            int month = Integer.parseInt(fechaParts[1]) - 1;
            int year = Integer.parseInt(fechaParts[2]);
            fechaNacimiento.set(year, month, day);
            jugadorEncontrado.setFechaDeNacimiento(fechaNacimiento);
            
            System.out.println("Ingrese la nueva nacionalidad del jugador: ");
            jugadorEncontrado.setNacionalidad(scanner.next());
            
            System.out.println("Ingrese la nueva estatura en"+ " cm "+"del jugador: ");
            jugadorEncontrado.setEstatura(scanner.nextInt());
            
            System.out.println("Ingrese el nuevo peso del jugador: ");
            jugadorEncontrado.setPeso(scanner.nextInt());
            
            System.out.println("Ingrese la nueva posicion del jugador: ");
            jugadorEncontrado.setPosicion(scanner.next());
            
            System.out.println("Datos del jugador modificados correctamente.");
        } else {
            System.out.println("No se encontró ningún jugador con ese nombre y apellido.");
        }

	}
	
	public static void eliminarJugador() {
		System.out.println("Ingrese nombre del jugador: ");
		String nombre = scanner.next();
		
		System.out.println("Ingrese apellido del jugador: ");
		String apellido = scanner.next();
		
		Iterator<Jugador> iterator = jugadores.iterator();
        boolean jugadorEncontrado = false;

        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iterator.remove();
                System.out.println("Jugador eliminado correctamente");
                jugadorEncontrado = true;
            }
        }
        
        if (!jugadorEncontrado) {
        	System.out.println("No se encontro el jugador");
        }
	}
}