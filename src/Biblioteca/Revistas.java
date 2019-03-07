package Biblioteca;

public class Revistas extends Publicacion {
	private int año;
	private String mes;

	public Revistas(String nombre, String editorial,int año,String mes,String dniUsuario) {
		super(nombre, editorial,dniUsuario);
		this.año=año;
		this.mes=mes;
	}

	public int getAño() {
		return año;
	}

	public String getmes() {
		return mes;
	}

	public void setAño(int año) {
		this.año=año;
	}
	public void SetMes(String mes) {
		this.mes=mes;	
	}
	@Override
	public void Publicacion() {
		this.getNombre();
		this.getEditorial();
		this.getAño();
		this.getmes();
	}



}
