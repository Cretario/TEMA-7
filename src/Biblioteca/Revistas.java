package Biblioteca;

public class Revistas extends Publicacion {
	private int a�o;
	private String mes;

	public Revistas(String nombre, String editorial,int a�o,String mes,String dniUsuario) {
		super(nombre, editorial,dniUsuario);
		this.a�o=a�o;
		this.mes=mes;
	}

	public int getA�o() {
		return a�o;
	}

	public String getmes() {
		return mes;
	}

	public void setA�o(int a�o) {
		this.a�o=a�o;
	}
	public void SetMes(String mes) {
		this.mes=mes;	
	}
	@Override
	public void Publicacion() {
		this.getNombre();
		this.getEditorial();
		this.getA�o();
		this.getmes();
	}



}
