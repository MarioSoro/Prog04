/*Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y

dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del

modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada

carácter se transforme en 3 códigos ASCII mas es decir :

Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.

Desarrollar los programas de codificar y descodificar mediante dos funciones.*/

import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		String frase, cifrado,mayus;
		int clave=0,i;
		
		System.out.println("Introduce una frase en Mayusculas ");
		mayus=t.nextLine();
		System.out.println("Introduzca la clave con la que se codificará el texto ");
		clave=t.nextInt();
		
		clave= clave % 26;
		cifrado="";
		frase=mayus.toUpperCase();
			
		for(i=0;i<frase.length(); i++){
				if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
	                if ((frase.charAt(i) + clave) > 'Z') {
	                    cifrado +=((char) (frase.charAt(i) + clave - 26));
	                } else {
	                    cifrado +=((char) (frase.charAt(i) + clave));
	                }
	            }
	        }
	System.out.println("Cadena cifrada con clave = " + clave + " Este es su texto cifrado "+cifrado);

}
}
