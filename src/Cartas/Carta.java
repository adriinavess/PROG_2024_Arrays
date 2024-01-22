package Cartas;

public class Carta {
	
	private char valor;
	private char palo;
	
	
	public char getValor() {
		return valor;
	}
	public void setValor(char valor) {
		this.valor = valor;
	}
	public char getPalo() {
		return palo;
	}
	public void setPalo(char palo) {
		this.palo = palo;
	}
	
	public String toString() {
		return "[" + valor + "" + palo + "]";
	}

}
