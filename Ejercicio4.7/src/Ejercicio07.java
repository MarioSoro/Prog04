import java.util.Scanner;
public class Ejercicio07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		
		int contador,mayusculas=0,minusculas=0,numeros=0;
		String frase;
		
			System.out.println("Introduce una frase");
			frase=t.nextLine();
			
			for (contador=0;contador<frase.length();contador++) {
				
				if (frase.charAt(contador)>='0' && frase.charAt(contador)<='9')
					numeros++;
					
				else if (frase.charAt(contador)>='a' && frase.charAt(contador)<='z')
						minusculas++;
				
				else if (frase.charAt(contador)>='A' && frase.charAt(contador)<='Z')
					mayusculas++;
				
				}
			
			System.out.println("numeros "+numeros+"");
			System.out.println("mayusculas "+mayusculas+"");
			System.out.println("minusculas "+minusculas+"");
}
}

