package mx.com.cetech.clase5.ejercicio;

import java.util.Scanner;

import mx.com.cetech.clase5.bean.Empleado;

/*
 * Validar usuario y contraseña de los empleados
 */
public class LoginEmpleado {
	public static void main(String [] args){
		// Creando objeto Empleado
		Empleado alex = new Empleado();
		alex.setEdad(25);
		alex.setId(1);
		alex.setNombre("Alex");
		alex.setPuesto("Gerente");
		alex.setUsuario("alex");
		alex.setContrasenia("456");
		
		Empleado hector = new Empleado("Héctor", 29, 2, "Socio Mayoritario", "hector", "123");
		
		String usrAlx = alex.getUsuario();
		String passAlx = alex.getContrasenia();
		String usrHec = hector.getUsuario();
		String passHec = hector.getContrasenia();
		
		Scanner leer = new Scanner(System.in);
		String usr;
		String pass;
		System.out.println("Usuario: ");
		usr = leer.next();
		System.out.println("Password: ");
		pass = leer.next();
		
		if (usr.equalsIgnoreCase(usrAlx) && pass.equals(passAlx) || usr.equalsIgnoreCase(usrHec) && pass.equals(passHec)){
			System.out.println("\tBienvenido " + usr);
		} else{
			System.out.println("Usuario y/o Contraseña invalido...");
		}
	}
}
