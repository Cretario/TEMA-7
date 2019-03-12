package Biblioteca;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Usuario {
protected String dni;
protected String nombre;

Calendar c1 = Calendar.getInstance();
Calendar c2 = new GregorianCalendar();

String dia = Integer.toString(c1.get(Calendar.DATE));
String mes = Integer.toString(c2.get(Calendar.MONTH));
String año = Integer.toString(c1.get(Calendar.YEAR));

String Fecha =dia.concat("/"+mes+"/"+año);

Integer diaL =c2.get(Calendar.DATE+7);
ArrayList<String> fechaH = new ArrayList<String>();

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

public void setFecha(ArrayList fechaH) {
	this.fechaH=fechaH;
}

protected void AlquilarPublicacion(Publicacion publicacion,ArrayList libros) {
if(publicacion.isDisponible()&& publicacion.getDniUsuario()== this.dni) {
publicacion.setDisponible(false);
publicacion.setDniUsuario(dni);
fechaH.add(Fecha+""+this.getNombre());
System.out.println(" el Articulo "+publicacion.getNombre()+" ha sido alquilado"+" por "+this.getNombre()+" en la fecha "+Fecha);
}else {
System.out.println(publicacion.getNombre()+" no esta disponible para el alquiler");	
}



}
protected void DevolverPublicacion(Publicacion publicacion,int coduser) {
if(!publicacion.isDisponible()&& publicacion.getDniUsuario()== this.dni) {
publicacion.setDisponible(true);
publicacion.setDniUsuario(dni);
System.out.println(" El Articulo "+publicacion.getNombre()+" ha sido devuelto"+" por "+this.getNombre());

int numHistorial=fechaH.size();



}else {
System.out.println(publicacion.getNombre()+" no puedes devolver este articulo debido a que no lo has alquilado");	
}

for(int i=0;i<fechaH.size();i++)

if(this.Fecha==fechaH.get(coduser)+7) {

System.out.println("Devolucion fuera de tiempo");


}
	
}
	



protected void HistorialFecha(int coduser) {
	
	System.out.println(this.fechaH.get(0));
	
}
}


