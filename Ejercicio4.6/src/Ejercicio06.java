/*Dada una frase de no más de 80 caracteres hacer un programa que 
 * busque cuántas mayúsculas y minúsculas tiene y lo imprima
 */
//For para ir caracter a caracter
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		
			int contador,numeros=0,vocales=0,consonantes=0;
			String frase;
			
					System.out.print("Introduce una frase max. 80 caracteres");
					frase=t.nextLine();
					
				
					
					for (contador=0;contador<frase.length();contador++) {
						
					
					
					if (frase.charAt(contador)=='a' || frase.charAt(contador)=='e' || frase.charAt(contador)=='i' || frase.charAt(contador)=='o' || frase.charAt(contador)=='u') 
						vocales++;
					
					else if (frase.charAt(contador)>='a' && frase.charAt(contador)<='z') 
						consonantes++;
					
					else if (frase.charAt(contador)>='0'&&frase.charAt(contador)<='9') 
						numeros++;
					
					}
					System.out.println("Vocales "+vocales+"");
					System.out.println("consonantes "+consonantes+"");
					System.out.println("numeros "+numeros+"");
					
}
}