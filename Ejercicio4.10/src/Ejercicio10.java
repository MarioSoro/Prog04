/*10. Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras

distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras

debemos trabajar solo con mayúsculas.*/
import java.util.Scanner;
public class Ejercicio10 {
		public static void main (String []args){
		Scanner t= new Scanner (System.in);
		String frase,mayusculas;
		int i,distintas=0,frecuencia=0;
		
			System.out.println("Introduce una frase de maximo 60 Caracteres");
			mayusculas=t.nextLine();
			
			frase=mayusculas.toUpperCase();
			
			if(frase.length()<=60){
			for(i=0;i<frase.length();i++){
				if (frase.charAt(i)!='A' && frase.charAt(i)!='Z')
					distintas++;
					
				else if (frase.charAt(i)>='A' && frase.charAt(i)<='Z')
						frecuencia++;
			}
			}else{
				System.out.println("Su frase supera el maximo de caracteres");
			}
			System.out.println("Su frase tiene "+distintas+" letras distintas");
			System.out.println("En su frase se repiten "+frecuencia+" letras iguales");
}
}
