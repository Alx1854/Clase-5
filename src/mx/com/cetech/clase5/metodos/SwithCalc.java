package mx.com.cetech.clase5.metodos;

import java.util.Scanner;

public class SwithCalc {
	public int menu(int opcion){
		Scanner teclado = new Scanner(System.in);
		int num1;
		int num2;
		int contador = 0;
		int resultado = 1;
		
			switch(opcion){
			case 1:
				System.out.println("SUMA");
				System.out.print("Da el primer numero: ");
				num1 = teclado.nextInt();
				System.out.print("Da el segundo numero: ");
				num2 = teclado.nextInt();
				resultado = num1 + num2;
				break;
				
			case 2:
				System.out.println("RESTA");
				System.out.println("Da el primer numero: ");
				num1 = teclado.nextInt();
				System.out.println("Da el segundo numero: ");
				num2 = teclado.nextInt();
				resultado = num1 - num2;
				break;
				
			case 3:
				System.out.println("MULTIPLICACION");
				System.out.print("Da el primer numero ");
				num1 = teclado.nextInt();
				System.out.print("Da el segundo numero ");
				num2 = teclado.nextInt();
				resultado = num1 * num2;
				break;
				
			case 4:
				System.out.println("FACTORIAL");
				System.out.print("Da el numero para obtener su factorial: ");
				num1 = teclado.nextInt();
				int contadorF = num1;
				for(num1 = num1; contadorF >= 1 ; contadorF--){
					resultado = resultado * contadorF;
				}
				break;
			
			case 5:
				System.out.println("EXPONENCIAL");
				System.out.print("Da el número base: ");
				num1 = teclado.nextInt();
				System.out.print("Da el exponente: ");
				num2 = teclado.nextInt();
				for(contador = 1 ; contador <= num2 ; contador++){
					resultado = resultado * num1;
				}
				break;
				
			case 6:
				System.out.println("SALE BYE!!");
				System.exit(opcion);
			default:
				System.out.println("Opción no válida!!\n");
				break;
			} //End Switch
			return resultado;
		}
}
