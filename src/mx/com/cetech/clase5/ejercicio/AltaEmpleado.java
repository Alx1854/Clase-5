package mx.com.cetech.clase5.ejercicio;

import mx.com.cetech.clase5.bean.Empleado;

public class AltaEmpleado {
	public static void main(String [] args){
		
		// Creando un empleado
		Empleado alex = new Empleado();
		// new: palabra reservada para la creación de un nuevo objeto.
		// Empleado => Clase
		// alex => variable
		// new
		// Empleado() => contructor, permiete crear objetos
		alex.setEdad(25);
		alex.setId(1);
		alex.setNombre("Alex");
		alex.setPuesto("Gerente");
		alex.setUsuario("alex");
		alex.setContrasenia("456");
		
		System.out.println("\nNombre: " + alex.getNombre() + "\nEdad: " + alex.getEdad());
		
		// Creando empleado con constructor con todos sus campos
		Empleado hector = new Empleado("Héctor", 29, 2, "Socio Mayoritario", "hector", "123");
		System.out.println(alex.getNombre() + " " + hector.getNombre());
		hector.setEdad(28);
		int edad = hector.getEdad();
		System.out.println("Edad Héctor: " + edad);
	}
}
