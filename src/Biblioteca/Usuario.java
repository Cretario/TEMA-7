package Biblioteca;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Usuario {
protected String dni;
protected String nombre;

Calendar c1 = Calendar.getInstance();
Calendar c2 = new GregorianCalendar();

String dia = Integer.toString(c2.get(Calendar.DATE));
String mes = Integer.toString(c2.get(Calendar.MONTH));
String año = Integer.toString(c2.get(Calendar.YEAR));
ArrayList<String>fechaAl=new ArrayList<String>();
public Usuario(String dni,String nombre,String fecha) {
this.dni=dni;
this.nombre=nombre;

}


public String getDni() {
return dni;	
}

public String getNombre() {
return nombre;	
}

public void SetDni(String dni) {
this.dni=dni;
}

public void setNombre(String nombre) {
this.nombre=nombre;	
}

public void setFecha(ArrayList fechaA1) {
	this.fechaAl=fechaA1;
}

protected void AlquilarPublicacion(Publicacion publicacion) {
if(publicacion.isDisponible()&& publicacion.getDniUsuario()== this.dni) {
publicacion.setDisponible(false);
publicacion.setDniUsuario(dni);
this.setFecha(fechaAl);
System.out.println(" el Articulo "+publicacion.getNombre()+" ha sido alquilado"+" por "+this.getNombre());
}else {
System.out.println(publicacion.getNombre()+" no esta disponible para el alquiler");	
}



}
protected void DevolverPublicacion(Publicacion publicacion) {
if(!publicacion.isDisponible()&& publicacion.getDniUsuario()== this.dni) {
publicacion.setDisponible(true);
publicacion.setDniUsuario(dni);
System.out.println(" El Articulo "+publicacion.getNombre()+" ha sido devuelto"+" por "+this.getNombre());
}else {
System.out.println(publicacion.getNombre()+" no puedes devolver este articulo debido a que no lo has alquilado");	
}

if(c2.after(fechaAl)) {
System.out.println("Devolucion fuera de tiempo");	
}


}

}
