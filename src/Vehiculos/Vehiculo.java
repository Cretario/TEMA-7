package Vehiculos;

import java.util.Scanner;

public abstract class Vehiculo {
	protected static String matricula;
	protected static  String coche;


	public Vehiculo (String matricula,String coche) {
		this.matricula=matricula;
		this.coche=coche;
	}

	public String getmatricula() {
		return matricula;

	}
	public String getcoche() {
		return coche;


	}

	public void setcoche(String coche) {
		this.coche=coche;	
	}
	public void setMatricula(String matricula) {
		this.matricula=matricula;	
	}

	Scanner sc = new Scanner (System.in);


	public void DatosVehiculo() {



		System.out.println("Datos coche \n matricula:"+getmatricula()+"El coche con nombre"+getcoche());


	}
	public static void Desposito() {
		System.out.println("Deposito Lleno");
	}
	
	public void Conducir(){
		System.out.println(" Estoy Andado ");	
	}
	public void Frenar() {
		System.out.println(" Estoy aparcao ");	
	}
	
	@Override
	public String toString() {
		return super.toString().concat("matricula");
	}
	public abstract void Vehiculo();




}
