package Vehiculos;

public class Vehiculo2 extends Vehiculo {
	private String nombre;
	private String apellidos;
	private int codcliente;
	public Vehiculo2(String nombre,String apellidos,int codcliente) {
		super(coche,matricula);
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.codcliente=codcliente;
	}

	public void propietario() {
		nombre=" Jesus";
		apellidos=" Macarro Sancho";
		codcliente= 1 ;
		System.out.println(nombre+apellidos+" Es Propietario ");
	}

	public void Deposito() {
		System.out.println("Estoy en reserva ve a la gasolinera mas cercana");
	}
	
	@Override
	public void Vehiculo() {
		coche=" FIAT 600 ";
		matricula=" 4567DEF ";
		propietario();
		System.out.println(" DE "+super.getcoche()+" CON MATRICULA: "+super.getmatricula());

	}
}
