package Vehiculos;

import java.util.Scanner;

public class Vehiculo1 extends Vehiculo {
	private String nombre;
	private String apellidos;
	private int codcliente;

	public Vehiculo1(String nombre,String apellidos,int codcliente) {
		super(coche,matricula);	
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.codcliente=codcliente;

	}
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public int codcliente(){
		return codcliente;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;	
	}

	public void setApellidos(String apellidos) {
		this.apellidos=apellidos;
	}

	public void setcodigo(int codcliente) {
		this.codcliente=codcliente;
	}
	public void propietario() {
		nombre="Andres ";
		apellidos="Masset Ruiz";
		codcliente=1;

		System.out.println("El Propietario es "+nombre+apellidos+"con el codigo "+codcliente);
	}



	public void Vehiculo() {
		coche="Audi A3";
		matricula=" 1234ABC ";


		System.out.println(" El "+super.getcoche()+" con matricula "+super.getmatricula());
		propietario();
	}

	
public void Deposito() {
	System.out.println("Estoy Vacio recargme el deposito");
}
}
