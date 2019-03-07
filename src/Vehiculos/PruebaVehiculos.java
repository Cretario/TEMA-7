package Vehiculos;

import java.util.Scanner;

public class PruebaVehiculos {
	static Scanner sc = new Scanner (System.in);
	public static void main (String[]args) {
		Vehiculo1 v1 = new Vehiculo1(null, null, 0);
		Vehiculo2 v2 = new Vehiculo2(null, null, 0);
		v1.Conducir();
		v1.Frenar();
		v2.Desposito();
		v2.Conducir();
	}
}
