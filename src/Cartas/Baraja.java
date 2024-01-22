package Cartas;

import java.util.Arrays;

public class Baraja {
	
	private Carta cartas[];
	
	
	public Baraja() {
		
		cartas = new Carta[52];
	}
	
	public String toString() {
		return "Baraja [" + Arrays.toString(cartas) + "]";
	}
	

}
