package Biblioteca;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class PruebaBiblioteca {

	static Scanner sc = new Scanner(System.in);
	public static void main (String[]args) {

		
	ArrayList<String> libros = new ArrayList<String>();
	Libro[] libro = new Libro[libros.size()];	
	libros.add("GGRR MARTIN "+"JUEGO DE TRONOS");
		libros.add("GGRR MARTIN "+"CHOQUE DE REYES");
		libros.add("GGRR MARTIN "+"TORMENTAS DE ESPADAS");
		libros.add("GGRR MARTIN "+"FESTIN DE CUERVOS");
		libros.add("GGRR MARTIN "+"DANZA DE DRAGONES");
		libros.add("GGRR MARTIN "+"VIENTOS DE INVIERNO");
		libros.add("GGRR MARTIN "+"SUEÑOS DE PRIMAVERA");
		libros.add("GGRR MARTIN "+"FUEGO Y SANGRE");
				
			

		ArrayList<String> usuarios  = new ArrayList<String>();
		Usuario[] usuario  = new Usuario[usuarios.size()];
		usuarios.add(" "+"Cretario "+"5/07/1998");
		usuarios.add(" "+"Pedro "+"5/05/2019");
		usuarios.add(" "+"Juan "+"23/04/2000");

		
		
		
		for(int i=0;i<libros.size();i++) {
			System.out.println(libros.get(i));
		}
		
		for(int i=0;i<usuarios.size();i++) {
			System.out.println(usuarios.get(i));
		}
		
		//usuarios[1].AlquilarPublicacion(libro[1]);
		//usuarios[2].AlquilarPublicacion(libro[2]);
		
	
		System.out.println("Elige una opcion \n 1-AlquilarLibro \n 2-DevolverLibro \n 3-HistorialdeUsuario");
		int opcion;
		
		do {
			
		 opcion=sc.nextInt() ;
			int coduser = 0;
			int codlibro = 0;
			
		
			switch(opcion) {

			case 1:

				System.out.println("Introduce tu codigo de usuario");
				coduser=sc.nextInt();
				System.out.println("Introduce el codigo del libro que quieras alquilas");
			
				codlibro=sc.nextInt();
				usuario[usuarios.get(0)].AlquilarPublicacion(libros.get(codlibro));
				




				break;

			case 2:
				
				
				System.out.println(" Introduce tu codigo usuario ");
				coduser=sc.nextInt();
				System.out.println("Introduce el Codigo del Libro");
				codlibro=sc.nextInt();
				usuarios[coduser].DevolverPublicacion(null,coduser,libros.get(codlibro));
				break;
				
			case 3:
				
				System.out.println("Introduce el numero de Historial de Usuario");
				coduser=sc.nextInt();
				usuarios[coduser].HistorialFecha(coduser);
			}

	
		}while(opcion<3);
		
		







		//ArrayList<Date> date = new ArrayList<Date>() ;
	
	
	//date.add(u1.AlquilarPublicacion(libro));

	}


}
			