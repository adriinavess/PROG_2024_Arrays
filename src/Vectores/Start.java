package Vectores;

import java.util.Arrays;

public class Start {

	public static void main(String[] args) {
		
		char frase[] = new char[10];
		
		frase[0] = 'A';
		frase[1] = 'B';
		frase[2] = 'C';
		frase[3] = 'D';
		frase[4] = 'E';
		frase[5] = 'F';
		frase[6] = 'G';
		frase[7] = 'H';
		frase[8] = 'I';
		frase[9] = 'J';

		
		for(int i=frase.length-1;i>=0;i--) {
			System.out.println(frase[i]);
		}
	}

}
