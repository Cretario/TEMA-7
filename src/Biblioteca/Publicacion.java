package Biblioteca;

public abstract class Publicacion {
	private String nombre;
	private String editorial;
	private boolean disponible=true;
	protected String dniUsuario=" ";

	public Publicacion(String nombre,String editorial,String dniUsuario){
		this.nombre=nombre;
		this.editorial=editorial;
		this.dniUsuario=dniUsuario;
	}

	public String getDniUsuario() {
		return dniUsuario;
	}

	public void setDniUsuario(String dniUsuario) {
		this.dniUsuario = dniUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public String getEditorial() {
		return editorial;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void SetNombre(String nombre) {
		this.nombre=nombre;
	}

	public void SetEditorial(String editorial) {
		this.editorial=editorial;
	}
	public void setDisponible(boolean disponible) {
		this.disponible=disponible;
	}
	@Override
	public String toString() {
		return "Publicacion [nombre=" + nombre + ", editorial=" + editorial + "]";
	}

	public abstract void Publicacion();

}
