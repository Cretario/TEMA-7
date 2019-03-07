package Biblioteca;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class PruebaBiblioteca {

	static Scanner sc = new Scanner(System.in);
	public static void main (String[]args) {

	
		
		Libro[] libro = new Libro[3];

		libro[0] = new Libro ("Juego de Tronos","GIGAMESHT","GGRRMARTIN", " ");
		libro[1] = new Libro ("Choque de Reyes","GIGAMESHT","GGRRMARTIN", " ");
		libro[2] = new Libro ("Tormenta de Espadas","GIGAMESHT","GGRRMARTIN", " ");

		Usuario[] usuarios  = new Usuario[3];

		usuarios[0] = new Usuario(" ","Cretario", "5/07/1998");
		usuarios[1] = new Usuario(" ","Pedro", "5/05/2019");
		usuarios[2] = new Usuario(" ","Pedro", "23/04/2000");

		//usuarios[1].AlquilarPublicacion(libro[1]);
		//usuarios[2].AlquilarPublicacion(libro[2]);
		System.out.println("Elige una opcion \n 1-AlquilarLibro \n 2-DevolverLibro");
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
				usuarios[coduser].AlquilarPublicacion(libro[codlibro]);	




				break;

			case 2:
				
				
				System.out.println(" Introduce tu codigo usuario ");
				coduser=sc.nextInt();
				System.out.println("Introduce el Codigo del Libro");
				codlibro=sc.nextInt();
				usuarios[coduser].DevolverPublicacion(libro[codlibro]);
				break;
			}

	
		}while(opcion<3);
		
		







		//ArrayList<Date> date = new ArrayList<Date>() ;
		//date.add(u1.AlquilarPublicacion(libro));

	}

}
