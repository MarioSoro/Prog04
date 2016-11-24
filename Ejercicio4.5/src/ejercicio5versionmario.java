/*Dada una frase de no más de 80 caracteres hacer un programa que 
 * busque cuántas mayúsculas y minúsculas tiene y lo imprima
 */
//For para ir caracter a caracter
import java.util.Scanner;
public class ejercicio5versionmario {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		
		String caracter;
		int contador=0;
			System.out.println("Escriba su frase de como maximo 80 caracteres");
			caracter = t.nextLine();
			
			while (caracter.length()>=80) {
				System.out.println("Introduzca una frase de como maximo 80 caracteres");
				caracter = t.nextLine();
			}
			System.out.println("Impares");
			for (contador=0;contador<caracter.length();contador+=2) {
				
				System.out.println(caracter.charAt(contador));
				}
			System.out.println("Pares");
			for (contador=1;contador<=caracter.length();contador+=2) {
				
				System.out.println(caracter.charAt(contador));
				}

				
		
	}
}
