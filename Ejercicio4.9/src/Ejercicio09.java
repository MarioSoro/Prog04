/*Dada una frase de no más de 80 caracteres hacer un programa que 
 * busque cuántas mayúsculas y minúsculas tiene y lo imprima
 */
//For para ir caracter a caracter
import java.util.Scanner;
public class Ejercicio09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		
		String cadena;
		int contador=0,H1=0,M1=0,H2=0,M2=0, salida=00000000;
		
			System.out.println("Escriba su frase de como maximo 80 caracteres");
			cadena = t.nextLine();

			
			while (cadena.length()==8) {
				
			if (cadena.charAt(4)=='H' && cadena.charAt(5)=='1' ) {
				H1++;
				
			}
			else if (cadena.charAt(4)=='M' && cadena.charAt(5)=='1' ) {
				M1++;
			}
			else if (cadena.charAt(4)=='H' && cadena.charAt(5)=='2' ) {
				H2++;
			}
			else if (cadena.charAt(4)=='M' && cadena.charAt(5)=='2' ) {
				M2++;
			}
			contador++;
			}
			
			System.out.println("En primero hay "+H1+ " hombres");
			System.out.println("En primero hay "+M1+ " mujeres");
			System.out.println("En segundo hay "+H2+ " hombres");
			System.out.println("En segundo hay "+M2+ " mujeres");
			System.out.println("Has introducido "+contador+ " codigos correctos");
			
			
			}
		
	}

