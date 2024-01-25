package Cartas;

public class Carta {
	
	private char valor;
	private char palo;
	private boolean bocaArriba = true;
	
	public boolean isBocaArriba() {
		return bocaArriba;
	}
	public void setBocaArriba(boolean bocaArriba) {
		this.bocaArriba = bocaArriba;
	}
	
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
		
		String devolver =  "[" + valor + "" + palo;
		if(bocaArriba) {
			devolver += "]";
		}
		else devolver += "*]";
		
		return devolver;
	}

}
