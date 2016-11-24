/*Dada una frase de no más de 80 caracteres hacer un programa que 
 * busque cuántas mayúsculas y minúsculas tiene y lo imprima
 */
//For para ir caracter a caracter
import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int  contadormayusculas=0,contadorminusculas=0,caracter, posicion=0;
		String frase;
			System.out.println("Escriba su frase de como maximo 80 caracteres");
			frase = t.nextLine();
	

		
		if(frase.length()<=80){
		
			/*while(posicion<frase.length()){
			
			caracter=frase.charAt(posicion);
			
			if (caracter>='a'&& caracter<='z'){
				contadorminusculas++;
			}
			if(caracter>='A'&& caracter<='Z'){
				contadormayusculas++;
			}
			posicion++;
		}
		}*/
			
			
			
			for(posicion=0;posicion<frase.length();posicion++){
			caracter=frase.charAt(posicion);
			
			if (caracter>='a'&& caracter<='z'){
				contadorminusculas++;
			}
			if(caracter>='A'&& caracter<='Z'){
				contadormayusculas++;
			}
			}
			
		}
				System.out.println(contadormayusculas);
				System.out.println(contadorminusculas);
		
	}
}

