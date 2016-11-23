
/*Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y

dado un numero entre 1 y 10 haga un cifrado de la frase (denominado cifrado CESAR) del

modo siguiente , si el numero por ejemplo es 3, transforme la frase de manera que cada

carácter se transforme en 3 códigos ASCII mas es decir :

Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.

Desarrollar los programas de codificar y descodificar mediante dos funciones.*/

import java.util.Scanner;
public class Descifrar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		String frase, cifrado;
		int clave=0,i;
		
		System.out.println("Introduzca su frase codificada ");
		frase=t.nextLine();
		System.out.println("Introduzca la clave con la que se descodificará el texto ");
		clave=t.nextInt();
		clave= clave % 26;
		cifrado="";
			for(i=0;i<frase.length(); i++){
				if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
	                if ((frase.charAt(i) - clave) < 'A') {
	                    cifrado+=((char) (frase.charAt(i) - clave + 26));
	                } else {
	                    cifrado+=((char) (frase.charAt(i) - clave));
	                }
	            }
	        }

	System.out.println("Cadena cifrada con clave = " + clave + "Este es su texto cifrado "+cifrado);

}
}
