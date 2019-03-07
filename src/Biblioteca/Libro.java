package Biblioteca;

public class Libro extends Publicacion {
	private String autor;
	public Libro(String nombre, String editorial,String autor,String dniUsuario) {
		super(nombre, editorial,dniUsuario);
		this.autor=autor;
	}
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor=autor;
	}

	@Override
	public void Publicacion() {
		this.getNombre();
		this.getEditorial();
		this.getAutor();

		System.out.println(this.getNombre()+"\t"+this.getAutor()+"\t"+this.getEditorial());

	}

	protected void Libro() {
		System.out.println(this.getNombre()+this.getAutor()+this.getEditorial());
	}

}
