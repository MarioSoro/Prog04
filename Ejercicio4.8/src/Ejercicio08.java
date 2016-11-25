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
	                    cifrado =cifrado+((char) (frase.charAt(i) + clave - 26));
	                } else {
	                    cifrado =cifrado+((char) (frase.charAt(i) + clave));
	                }
	            }
	        }
	System.out.println("Cadena cifrada con clave = " + clave + " Este es su texto cifrado "+cifrado);
	System.out.println("");

		Scanner t1= new Scanner (System.in);
		String frase1, cifrado1;
		int clave1=0,i1;
		
		System.out.println("Introduzca su frase codificada ");
		frase1=t1.nextLine();
		System.out.println("Introduzca la clave con la que se descodificará el texto ");
		clave1=t1.nextInt();
		clave1= clave1 % 26;
		cifrado1="";
			for(i1=0;i1<frase1.length(); i1++){
				if (frase1.charAt(i1) >= 'A' && frase1.charAt(i1) <= 'Z') {
	                if ((frase1.charAt(i1) - clave1) < 'A') {
	                    cifrado1+=((char) (frase1.charAt(i1) - clave1 + 26));
	                } else {
	                    cifrado1+=((char) (frase1.charAt(i1) - clave1));
	                }
	            }
	        }

	System.out.println("Cadena cifrada con clave = " + clave + " Este es su texto cifrado "+cifrado1);

}
}
