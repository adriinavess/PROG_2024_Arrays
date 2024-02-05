package Strings;

public class Start {

	public static void main(String[] args) {
		
		int contador = 0;
		String nombre = "hola tu";
		
		for(int x=0;x<nombre.length();x++) {
			switch(nombre.charAt(x)){
			
			case'a', 'A', 'á', 'À':contador++; break;
			case'e', 'E', 'é', 'É':contador++; break;
			case'i', 'I', 'í', 'Í':contador++; break;
			case'o', 'O', 'ó', 'Ó':contador++; break;
			case'u', 'U', 'ú', 'Ú':contador++; break;
			}
		}
		
		System.out.println("La cantidad de vocales es " + contador);
	}
}
