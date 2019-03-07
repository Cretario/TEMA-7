package Usuario;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
	private String nombre;
	private String dni;
	private String FechaNa;
	private String usuario;
	private int claveAcceso;
	static Scanner teclado = new Scanner (System.in);
	public Usuario(String nombre,String dni,String FechaNa,String usuario,int claveAcceso) {
		this.nombre=nombre;
		this.dni=dni;
		this.FechaNa=FechaNa;
		this.usuario=usuario;
		this.claveAcceso=claveAcceso;
	}
	public String GetNombre(){
		return nombre;
	}

	public void SetNombre(String nombre) {
		this.nombre=nombre;
	}

	public String GetDni() {
		return dni;
	}
	public void SetDni(String dni) {
		this.dni=dni;	
	}
	public String GetFechaNa(){
		return FechaNa;	
	}
	public void SetFechaNa(String FechaNa) {
		this.FechaNa=FechaNa;	
	}
	public String GetUsuario() {
		return usuario;
	}
	public void SetUsuario(String usuario) {
		this.usuario=usuario;
	}
	public int GetClaveAcceso(){
		return claveAcceso;
	}
	public void SetClaveAcceso(int claveAcceso) {
		this.claveAcceso=claveAcceso;
	}

	
	protected void DarAlta() {
		
	
		System.out.println("Introduce tu nombre");
		this.nombre=teclado.nextLine();
		String nombreentero=this.nombre ;

		
		String[] NombreCompleto=nombreentero.split(" ");
		usuario=NombreCompleto[0].substring(0, 3)+NombreCompleto[1].substring(0, 3)+NombreCompleto[2].substring(0, 3);

		System.out.println(" Tu usuario es "+usuario);
		String clave;
		clave=Clave();
		System.out.println(clave);
			
		}
		
		
		//ArrayList<String> usuarios = new ArrayList<String>();
		//usuarios.add(this.usuario);
		//System.out.println("usuario almacenado como "+usuarios.get(0));


				
	
	
	


protected static String Clave () {
	String[] simbolos = {"A","B","C","D","5","6","7","8","¿","!"};
	Random randon = new Random();
	int media=10;
	try {
		
		randon=SecureRandom.getInstanceStrong();	
		
	}catch(NoSuchAlgorithmException e) {
		e.printStackTrace();
	}
		
		String clave; 
		clave=randon.toString();
		
		System.out.println(clave);
		StringBuilder sb = new StringBuilder(media);
		for(int i=0;i< media;i++) {
			
			int IndiceAleatorio=randon.nextInt(simbolos.length);
				sb.append(simbolos[IndiceAleatorio]);
				
		}
		return sb.toString();	
}
			
//public static String MayorEdad() {
	
//}
	
}
	


	
	



