package mx.com.cetech.clase5.ejercicio;

import java.util.Scanner;

import mx.com.cetech.clase5.metodos.SwithCalc;

public class Calculadora {
	public static void main(String [] args){
		// Variables
		Scanner leer = new Scanner(System.in);
		
		System.out.println("\tBienvenido a Calculadora App");
		System.out.println("Elige una opción: \n 1-Suma \n 2-Resta \n 3-Multi \n 4-Factorial \n 5-Exponencial \n 6-Salir");
		int opcion = leer.nextInt();
		
		SwithCalc SCalc = new SwithCalc();
		
		int resultado = SCalc.menu(opcion);
		System.out.println("Resultado: " + resultado);
	}
}

/*
* Autor: Alex Chaparro
* Fecha: 06 de Diciembre de 2014
**/