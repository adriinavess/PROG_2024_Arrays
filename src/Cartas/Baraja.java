package Cartas;

import java.util.Arrays;

public class Baraja {
	
	private Carta cartas[];
	
	
	public Baraja() {
		cartas = new Carta[52];
		
		for (int i = 0; i < 13; i++) {
			cartas[i] = crearCartas(i+1, 'C');
		}
		for (int i = 0; i < 13; i++) {
			cartas[13+i] = crearCartas(i+1, 'P');
		}
		for (int i = 0; i < 13; i++) {
			cartas[26+i] = crearCartas(i+1, 'D');
		}
		for (int i = 0; i < 13; i++) {
			cartas[39+i] = crearCartas(i+1, 'T');
		}
	}
	
	private Carta crearCartas(int numero, char palo) {
		Carta carta = new Carta();
		
		switch(numero) {
		case 1: carta.setValor('A'); break;
		case 2: carta.setValor('2'); break;
		case 3: carta.setValor('3'); break;
		case 4: carta.setValor('4'); break;
		case 5: carta.setValor('5'); break;
		case 6: carta.setValor('6'); break;
		case 7: carta.setValor('7'); break;
		case 8: carta.setValor('8'); break;
		case 9: carta.setValor('9'); break;
		case 10: carta.setValor('D'); break;
		case 11: carta.setValor('R'); break;
		case 12: carta.setValor('Q'); break;
		case 13: carta.setValor('K'); break;
		}
		carta.setPalo(palo);
		
		return carta;
	}
	
	public String toString() {
		return "Baraja [" + Arrays.toString(cartas) + "]";
	}
	
	public void voltearCarta(char valor, char palo) {
		
		//Buscar Carta --valor, palo--
		Carta carta = buscarCarta(valor,palo);
		int posicion = buscarIndiceCarta(valor,palo);

		//dar vuelta carta
		carta.setBocaArriba(false);
		cartas[posicion].setBocaArriba(false);
	}
	
	private Carta buscarCarta(char valor, char palo) {
		
		Carta devolver = null;
		int i = 0;
		boolean encontrado = false;
		
		while((i<cartas.length)&&(!encontrado)) {
			
			if(cartas[i].getValor()==valor 
			   && cartas[i].getPalo()==palo) {
				
				encontrado = true;
				devolver = cartas[i];
			}
			i++;
		}
		return devolver;
	}
	
	private int buscarIndiceCarta(char valor, char palo) {
		
		int devolver = -1;
		int i = 0;
		boolean encontrado = false;
		
		while((i<cartas.length)&&(!encontrado)) {
			
			if(cartas[i].getValor()==valor 
			   && cartas[i].getPalo()==palo) {
				
				encontrado = true;
				devolver = i;
			}
			i++;
		}
		return devolver;
	}
	
	private void intercambiar(int pos1, int pos2) {
		Carta temporal = cartas[pos1];
		cartas[pos1] = cartas[pos2];
		cartas[pos2] = temporal;
	}
	
	public void barajar() {
		int i=0;
		while(i<10) {
			int pos1 = (int)(Math.random()*52);
			int pos2 = (int)(Math.random()*52);
			
			if(pos1 != pos2) {
				intercambiar(pos1, pos2);
				i++;
			}
		}
	}


}
